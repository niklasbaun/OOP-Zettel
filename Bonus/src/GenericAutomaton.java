import java.util.Arrays;

public abstract class GenericAutomaton {
    protected State[] states;
    protected Transition[] transitions;
    protected Alphabet alphabet;
    protected String start;

    public GenericAutomaton(Alphabet alphabet, String start) {
        this.alphabet = alphabet;
        this.states = new State[0];
        this.transitions = new Transition[0];
        this.start = start;
    }

    public abstract void reset();
    public abstract boolean isAccepting();

    /** Adds a state to the array states if it doesn't already exist in states
     *
     * @param state The state that is to be added
     * @param isStart Whether state is a start state or not
     * @throws StateAlreadyExists Throws if state already exists in states
     */
    public void addState(State state, boolean isStart) throws StateAlreadyExists{
        //check if state already exists
        for (State currentState : this.states) {
            if (currentState.getId().equals(state.getId())) {
                throw new StateAlreadyExists(state);
            }
        }
        //add state to the Array states
        State[] newStates = Arrays.copyOf(this.states, this.states.length + 1);
        if (isStart) {
            this.start = state.getId();
        }
        newStates[this.states.length] = state;
        this.states = newStates;
    }

    /** Checks if a State with a specific id is in the Array states
     *
     * @param id The id of the state the methode is searching
     * @return The state with the id if it exists, else null
     */
    public State findState(String id) {
        for (State state : this.states) {
            if (state.getId().equals(id)) {
                return state;
            }
        }
        return null;
    }

    /** Adds a transition to the array transitions if all states of transition exist in states and the alphabet contains the symbol
     *
     * @param transition The transition that is to be added
     * @throws StateDoesNotExist Throws if either state of transition doesn't exist in states
     * @throws SymbolNotInAlphabet Throws if the alphabet doesn't contain the symbol of transition
     */
    protected void addTransition(Transition transition) throws StateDoesNotExist, SymbolNotInAlphabet{
        //Check if state does not exist or symbol is not in alphabet
        if (Arrays.stream(this.states).noneMatch(state -> state.getId().equals(transition.getIdStart()))) {

            throw new StateDoesNotExist(transition.getIdStart());

        } else if (Arrays.stream(this.states).noneMatch(state -> state.getId().equals(transition.getIdEnd()))) {

            throw new StateDoesNotExist(transition.getIdEnd());

        } else if (!(alphabet.isInAlphabet(transition.getSymbol()))) {

            throw new SymbolNotInAlphabet(transition.getSymbol());
        }
        //Add transition to array transitions
        Transition[] newTransitions = Arrays.copyOf(this.transitions, this.transitions.length + 1);
        newTransitions[this.transitions.length] = transition;
        this.transitions = newTransitions;

    }
}
