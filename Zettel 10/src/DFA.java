public class DFA extends GenericAutomaton {
    String current;
    /**
     * constructor for GenericAutomaton
     *
     * @param alphabet
     */
    public DFA(Alphabet alphabet) {
        super(alphabet);
    }

    @Override
    void reset() {

    }

    @Override
    boolean isAccepting() {
        return false;
    }
}
