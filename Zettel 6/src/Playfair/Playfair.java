package Playfair;

public class Playfair {
    private final char[][] playfairSquare ;
    private final String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * constructor for playfair class
     * @param codeword
     */
    public Playfair(String codeword) {
        //get all UpperCase letters of codeword
        String codewordUpper = codeword.toUpperCase();
        //remove all doubles
        String codewordNoDoubles = removeDoubles(codewordUpper);
        //add all the missing char from the alphabet
        String codewordComplete = addMissingChars(codewordNoDoubles);
        //fill playfair square
        this.playfairSquare = fillPlayfairSquare(codewordComplete);
    }




    /**
     * method to make all letters uppercase
     * @param s
     * @return
     */
    private String toUpperCase(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += Character.toUpperCase(s.charAt(i));
        }
        return newString;
    }

    /**
     * removes all doubles from the codeword
     * @param codewordUpper
     * @return codeword without doubles
     */
    public String removeDoubles(String codewordUpper) {
        String codewordNoDoubles = "";
        for (int i = 0; i < codewordUpper.length(); i++) {
            if (codewordNoDoubles.indexOf(codewordUpper.charAt(i)) == -1) {
                codewordNoDoubles += codewordUpper.charAt(i);
            }
        }
        return codewordNoDoubles;
    }

    /**
     * adds all missing chars from the alphabet to the codeword
     * @param codewordNoDoubles
     * @return codeword with all missing chars
     */
    private String addMissingChars(String codewordNoDoubles) {
        String codewordComplete = codewordNoDoubles;
        for (int i = 0; i < Alphabet.length(); i++) {
            if (characterInString(codewordComplete, Alphabet.charAt(i)) == false) {
                codewordComplete += Alphabet.substring(i, i+1);
            }
        }
        return codewordComplete;
    }

    /**
     * creates a playfair square with the given codeword
     * @param codewordComplete
     * @return playfair square
     */
    private char[][] fillPlayfairSquare(String codewordComplete) {
        char[][] playfairSquare = new char[5][5];
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                playfairSquare[i][j] = codewordComplete.charAt(counter);
                counter++;
            }
        }
        return playfairSquare;
    }

    /**
     * looks if a char is in a String
     * @param s
     * @param character
     * @return true if char is in String, false if not
     */
    private boolean characterInString(String s, Character character) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }

}
