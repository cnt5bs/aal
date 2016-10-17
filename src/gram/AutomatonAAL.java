package gram;
import br.usp.poli.lta.cereda.aa.execution.AdaptiveAutomaton;
import br.usp.poli.lta.cereda.aa.model.Submachine;
import br.usp.poli.lta.cereda.aa.model.Transition;
public class AutomatonAAL extends AdaptiveAutomaton {

    public void add(Transition t) {
        transitions.add(t);
    }

    @Override
    public void setup() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void addSubMachine(Submachine nova) {
        submachines.add(nova);
    }
}
