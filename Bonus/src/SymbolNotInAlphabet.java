public class SymbolNotInAlphabet extends Exception{

    public SymbolNotInAlphabet(Character input) {
        super("Character: " + input + " is not in Alphabet");
    }
}