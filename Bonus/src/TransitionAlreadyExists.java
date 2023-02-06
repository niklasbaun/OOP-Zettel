public class TransitionAlreadyExists extends Exception{

    public TransitionAlreadyExists(Transition input) {
        super("Transition: " + input + " already exists");
    }
}
