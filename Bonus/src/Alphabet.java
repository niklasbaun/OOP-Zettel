public class Alphabet {
    private Character[] inputSymbols;

    public Alphabet(Character[] inputSymbols) {
        this.inputSymbols = inputSymbols;
    }

    /** Getter Method for inputSymbols
     *
     * @return inputSymbols
     */
    public Character[] getInputSymbols() {
        return inputSymbols;
    }

    /**Checks whether a Character is in the current Alphabet object
     *
     * @param c The Character that is to be checked
     * @return Whether the Character is in the Alphabet or not
     */
    public boolean isInAlphabet(Character c) {
        for (Character inputSymbol : this.inputSymbols) {
            if (inputSymbol == c) {
                return true;
            }
        }
        return false;
    }
}
