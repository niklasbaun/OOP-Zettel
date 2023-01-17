public class Alphabet {

    Character[] alphabet;

    public Alphabet(Character[] alphabet) {
        this.alphabet = alphabet;
    }

    /**
     * check if a character is in the alphabet
     * @param c the character to check
     * @return boolean true if char is in alphabet
     */
    public boolean contains(Character c) {
        for (Character character : alphabet) {
            if (character.equals(c)) {
                return true;
            }
        }
        // if we get here, the character is not in the alphabet
        //throw exception Symbol not in Alphabet
        throw new IllegalArgumentException("Symbol not in Alphabet");
    }
}
