public class StateAlreadyExists extends Exception {

    public StateAlreadyExists(State input) {
        super("State: " + input + "already exists");
    }
}
