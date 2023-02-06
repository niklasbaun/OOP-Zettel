public class State {
    private final String id;
    private final boolean isAcceptingState;

    public State(String id, boolean isAcceptingState) {
        this.id = id;
        this.isAcceptingState = isAcceptingState;
    }

    /**Getter Method for String id
     *
     * @return The value of String id
     */
    public String getId() {
        return this.id;
    }

    /**Getter Method for boolean isAcceptingState
     *
     * @return The value of boolean isAcceptingState
     */
    public boolean getIsAcceptingState() {
        return this.isAcceptingState;
    }
}