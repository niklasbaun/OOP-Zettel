public abstract class GenericAutomaton {

    State[] states;
    Transition[] transitions;
    Alphabet alphabet;
    String start;

    /**
     * constructor for GenericAutomaton
     */
    public GenericAutomaton(Alphabet alphabet) {
        this.states = new State[0];
        this.transitions = new Transition[0];
        this.alphabet = alphabet;
        this.start = "";

    /**
     * abstract method to reset the automaton
     */
    abstract void reset();

    /**
     * abstract method to check the state of the automaton
     * @return
     */
    abstract boolean isAccepting();

    void addState(State state, boolean isStart){
        // add state to states
        for (states: state) {
            if (state.ID.equals(state.ID)) {
                throw new IllegalArgumentException("State already exists");
            }
        }
        State[] newStates = new State[states.length + 1];
        System.arraycopy(states, 0, newStates, 0, states.length);
        newStates[states.length] = state;
        states = newStates;

        }
}
