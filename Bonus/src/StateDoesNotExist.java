public class StateDoesNotExist extends Exception{

    public StateDoesNotExist(String input) {
        super("State: " + input + " does not exist");
    }
}
