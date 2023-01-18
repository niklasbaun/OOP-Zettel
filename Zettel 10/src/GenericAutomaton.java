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
    }
    /**
     * abstract method to reset the automaton
     */
    abstract void reset();

    /**
     * abstract method to check the state of the automaton
     * @return
     */
    abstract boolean isAccepting();

    /**
     * method to add a state to the automaton
     */
    public void addState(State state, boolean isStart){
        // add state to states
        for (State s: states) {
            if (state.ID.equals(state.ID)) {
                throw new StateExceptions("Input State already exists in the Automaton");
            }
        }
        State[] newStates = new State[states.length + 1];
        System.arraycopy(states, 0, newStates, 0, states.length);
        newStates[states.length] = state;
        states = newStates;
        //set start the new state ID, if the user wants it
        if(isStart) {
            start = state.ID;
        }
    }

    /**
     * method to find a State by a given ID
     * @param id the id to search for
     * @return the searched state or null if the state is not found
     */
    public State findState(String id){
        for (State s: states) {
            if (s.ID.equals(id)) {
                return s;
            }
        }
        return  null;
    }

    /**
     * method to add a transition to the transition array
     *      1. if a state is not in the automaton throw StateDoesNotExistException
     *      2. if symbol is not in alphabet throw SymbolNotInAlphabetException
     * @param transition the transition to add
     */
    protected void addTransition(Transition transition){
        for (State s: states) {
            //check if none of the states matches either start or end of transition
            if (){

            }
        }
    }
}
