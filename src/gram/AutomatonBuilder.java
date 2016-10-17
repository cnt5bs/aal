package gram;
import br.usp.poli.lta.cereda.aa.examples.ExampleState;
import br.usp.poli.lta.cereda.aa.examples.ExampleSymbol;
import br.usp.poli.lta.cereda.aa.model.State;
import br.usp.poli.lta.cereda.aa.model.Submachine;
import br.usp.poli.lta.cereda.aa.model.Transition;
import br.usp.poli.lta.cereda.xml2aa.model.ListAction;
import gram.antlr4.AALBaseListener;
import gram.antlr4.AALParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class AutomatonBuilder extends AALBaseListener {
    AutomatonBuilder() {
        super();
        automaton = new AutomatonAAL();
    }
    public AutomatonAAL automaton;
    Set<String> states = new HashSet<>(); // mantive, mas acho que n?o precisa...
    @Override
    public void exitAdaptiveAutomaton(AALParser.AdaptiveAutomatonContext ctx) {
        ListAction.setCounter(states.stream().mapToInt(Integer::parseInt).
            max().getAsInt() + 1);
    }
    Transition t; // objeto que representa uma transi??o sendo constru?da
    
    @Override
    public void enterTransition(AALParser.TransitionContext ctx) {
        t = new Transition();
        String from = ctx.from().ID().getText();
        String to = ctx.to().ID().getText();
        t.setSourceState(new ExampleState(from));
        t.setTargetState(new ExampleState(to));
    }
    
    @Override
    public void exitTransition(AALParser.TransitionContext ctx) {
        automaton.add(t);
    }
    
    @Override
    public void exitFrom(AALParser.FromContext ctx) {
        states.add(ctx.ID().getText());
    }
    
    @Override
    public void exitTo(AALParser.ToContext ctx) {
        states.add(ctx.ID().getText());
    }
    
    @Override
    public void exitSimbolo(AALParser.SimboloContext ctx) {
        String nome = ctx.ID().getText();
        t.setSymbol(new ExampleSymbol(nome));
    }
    
    @Override
    public void exitChamada(AALParser.ChamadaContext ctx) {
        String nome = ctx.ID().getText();
        t.setSubmachineCall(nome);
    }
    @Override
    public void exitTransPreAdaptive(AALParser.TransPreAdaptiveContext ctx) {
        String nome = ctx.ID().getText();
        t.setPriorActionCall(nome);
        argLst = new ArrayList<>();
        t.setPriorActionArguments(argLst.toArray());
        argLst = null;
    }
    
    @Override
    public void enterTransPostAdaptive(AALParser.TransPostAdaptiveContext ctx) {
        String nome = ctx.ID().getText();
        t.setPostActionCall(nome);
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitTransPostAdaptive(AALParser.TransPostAdaptiveContext ctx) {
        t.setPostActionArguments(argLst.toArray());
        argLst = null;
    }
    @Override
    public void exitArg(AALParser.ArgContext ctx) {
        String param = ctx.ID().getText();
        argLst.add(param);
    }
    ArrayList<String> argLst;
    @Override
    public void enterSubmachine(AALParser.SubmachineContext ctx) {
    
        subMaquinaEstadoLst = new HashSet<>();
        subMaquinaAceitacaoLst = new HashSet<>();
        subMaquinaInicial = null;
    }
    
    @Override
    public void exitSubmachine(AALParser.SubmachineContext ctx) {
        String nome = ctx.ID().getText();
        Submachine nova = new Submachine(nome,
            subMaquinaEstadoLst, subMaquinaInicial, subMaquinaAceitacaoLst);
        automaton.addSubMachine(nova);
        if (ctx.main() != null) {
            automaton.setMainSubmachine(nome);
        }
    }
    
    @Override
    public void enterState(AALParser.StateContext ctx) {
        estadoCorrente = new ExampleState(ctx.ID().getText());
        subMaquinaEstadoLst.add(estadoCorrente);
    }
    State estadoCorrente;
    Set<State> subMaquinaEstadoLst;
    State subMaquinaInicial;
    Set<State> subMaquinaAceitacaoLst;
    
    @Override
    public void enterInicial(AALParser.InicialContext ctx) {
        subMaquinaInicial = estadoCorrente;
    }
    
    @Override
    public void enterTerminal(AALParser.TerminalContext ctx) {
        subMaquinaAceitacaoLst.add(estadoCorrente);
    }
    @Override
    public void enterActionPreAdaptive(AALParser.ActionPreAdaptiveContext ctx) {
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitActionPreAdaptive(AALParser.ActionPreAdaptiveContext ctx) {
        argLst = null;
    }
    
    @Override
    public void enterActionPostAdaptive(AALParser.ActionPostAdaptiveContext ctx) {
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitActionPostAdaptive(AALParser.ActionPostAdaptiveContext ctx) {
        argLst = null;
    }
    
    @Override
    public void enterArgAction(AALParser.ArgActionContext ctx) {
        argLst = new ArrayList<>();
    }
    
    @Override
    public void exitArgAction(AALParser.ArgActionContext ctx) {
        argLst = null;
    }
}
