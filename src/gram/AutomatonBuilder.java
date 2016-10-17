package gram;
import br.usp.poli.lta.cereda.aa.examples.ExampleState;
import br.usp.poli.lta.cereda.aa.examples.ExampleSymbol;
import br.usp.poli.lta.cereda.aa.model.State;
import br.usp.poli.lta.cereda.aa.model.Submachine;
import br.usp.poli.lta.cereda.aa.model.Transition;
import br.usp.poli.lta.cereda.xml2aa.model.ListAction;
import gram.antlr4.AASBaseListener;
import gram.antlr4.AASParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class AutomatonBuilder extends AASBaseListener {
    AutomatonBuilder() {
        super();
        automaton = new AutomatonAAL();
    }
    public AutomatonAAL automaton;
    Set<String> states = new HashSet<>(); // mantive, mas acho que n?o precisa...
    @Override
    public void exitAdaptiveAutomaton(AASParser.AdaptiveAutomatonContext ctx) {
        ListAction.setCounter(states.stream().mapToInt(Integer::parseInt).
            max().getAsInt() + 1);
    }
    Transition t; // objeto que representa uma transi??o sendo constru?da
    
    @Override
    public void enterTransition(AASParser.TransitionContext ctx) {
        t = new Transition();
        String from = ctx.from().ID().getText();
        String to = ctx.to().ID().getText();
        t.setSourceState(new ExampleState(from));
        t.setTargetState(new ExampleState(to));
    }
    
    @Override
    public void exitTransition(AASParser.TransitionContext ctx) {
        automaton.add(t);
    }
    
    @Override
    public void exitFrom(AASParser.FromContext ctx) {
        states.add(ctx.ID().getText());
    }
    
    @Override
    public void exitTo(AASParser.ToContext ctx) {
        states.add(ctx.ID().getText());
    }
    
    @Override
    public void exitSimbolo(AASParser.SimboloContext ctx) {
        String nome = ctx.ID().getText();
        t.setSymbol(new ExampleSymbol(nome));
    }
    
    @Override
    public void exitChamada(AASParser.ChamadaContext ctx) {
        String nome = ctx.ID().getText();
        t.setSubmachineCall(nome);
    }
    @Override
    public void exitTransPreAdaptive(AASParser.TransPreAdaptiveContext ctx) {
        String nome = ctx.ID().getText();
        t.setPriorActionCall(nome);
        argLst = new ArrayList<>();
        t.setPriorActionArguments(argLst.toArray());
        argLst = null;
    }
    
    @Override
    public void enterTransPostAdaptive(AASParser.TransPostAdaptiveContext ctx) {
        String nome = ctx.ID().getText();
        t.setPostActionCall(nome);
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitTransPostAdaptive(AASParser.TransPostAdaptiveContext ctx) {
        t.setPostActionArguments(argLst.toArray());
        argLst = null;
    }
    @Override
    public void exitArg(AASParser.ArgContext ctx) {
        String param = ctx.ID().getText();
        argLst.add(param);
    }
    ArrayList<String> argLst;
    @Override
    public void enterSubmachine(AASParser.SubmachineContext ctx) {
    
        subMaquinaEstadoLst = new HashSet<>();
        subMaquinaAceitacaoLst = new HashSet<>();
        subMaquinaInicial = null;
    }
    
    @Override
    public void exitSubmachine(AASParser.SubmachineContext ctx) {
        String nome = ctx.ID().getText();
        Submachine nova = new Submachine(nome,
            subMaquinaEstadoLst, subMaquinaInicial, subMaquinaAceitacaoLst);
        automaton.addSubMachine(nova);
        if (ctx.main() != null) {
            automaton.setMainSubmachine(nome);
        }
    }
    
    @Override
    public void enterState(AASParser.StateContext ctx) {
        estadoCorrente = new ExampleState(ctx.ID().getText());
        subMaquinaEstadoLst.add(estadoCorrente);
    }
    State estadoCorrente;
    Set<State> subMaquinaEstadoLst;
    State subMaquinaInicial;
    Set<State> subMaquinaAceitacaoLst;
    
    @Override
    public void enterInicial(AASParser.InicialContext ctx) {
        subMaquinaInicial = estadoCorrente;
    }
    
    @Override
    public void enterTerminal(AASParser.TerminalContext ctx) {
        subMaquinaAceitacaoLst.add(estadoCorrente);
    }
    @Override
    public void enterActionPreAdaptive(AASParser.ActionPreAdaptiveContext ctx) {
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitActionPreAdaptive(AASParser.ActionPreAdaptiveContext ctx) {
        argLst = null;
    }
    
    @Override
    public void enterActionPostAdaptive(AASParser.ActionPostAdaptiveContext ctx) {
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitActionPostAdaptive(AASParser.ActionPostAdaptiveContext ctx) {
        argLst = null;
    }
    
    @Override
    public void enterArgAction(AASParser.ArgActionContext ctx) {
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitArgAction(AASParser.ArgActionContext ctx) {
        argLst = null;
    }
}
