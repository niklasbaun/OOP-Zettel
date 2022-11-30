package Playfair;

public class Playfair {
    private final char[][] playfairSquare ;
    private final String Alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";

    /**
     * constructor of playfairSquare
     * @param codeword string
     * @return playfairSquare
     */
    public Playfair(String codeword) {
        String codewordUpper = toUpperCase(codeword);
        String sNoJ = "";
        String sClean = "";
        //format to the rules
        //remove J
        for(int i=0; i<codewordUpper.length(); i++){
            if(codewordUpper.charAt(i) == 'J'){
                continue;
            }
            sNoJ = sNoJ + codewordUpper.charAt(i);
        }
        //remove duplicates
        for (int i = 0; i < sNoJ.length(); i++) {
            if(!sClean.contains(String.valueOf(sNoJ.charAt(i)))) {
                sClean += String.valueOf(sNoJ.charAt(i));
            }
        }
        //add rest of Alphabet to the end
        for(int i=0; i<Alphabet.length(); i++) {
            if(characterInString( codewordUpper, Alphabet.charAt(i) ) == false) {
                codewordUpper = codewordUpper + Alphabet.charAt(i);
            }
        }
        char[][] playfairSquareTemp = new char[5][5];
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                playfairSquareTemp[i][j] = codewordUpper.charAt(5*i+j);
            }
        }
        this.playfairSquare = playfairSquareTemp;
    }

    /**
     * method to print the playfair square as a formatted String
     * @return the formatted String
     */
    public String printSquare() {
        String square = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square = square + playfairSquare[i][j] + " ";
            }
            square = square + " ";
        }
        return square;
    }

    /**
     * method to find the position of a character in the square
     * @param c the char
     * @return the position of the character
     */
    private Position findInSquare(char c){
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(playfairSquare[i][j] == c) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    /**
     * method to clean a string with the playfair rules
     *      *          - remove all non-alphabetical characters
     *      *          - if there are two identical characters in a block, insert an X between them
     *      *          - if the string is empty, return null
     * @param s the string
     * @return the cleaned string
     */
    private String cleanWord(String s){
        String sUpper = "";
        String sClean = "";
        String sPair = "";
        for(int i=0; i < s.length(); i++){
            //check if ASCII value is that of letters in the alphabet
            if(s.charAt(i)>64 && s.charAt(i)<=122){
                sClean = sClean + s.charAt(i);
            }
        }
        //create pairs
        for(int i=0; i < sClean.length(); i++ ){
            //if there would be the same char twice in a pair
            if(sClean.charAt(i) == sClean.charAt(i+1)) {
                sPair = sPair + sClean.charAt(i) + "X ";
            //if in the last pair there would only be one char
            } else if () {

            //else put pairs together from chars of string sClean
            }else {
                sPair = sPair + sClean.charAt(i) + sClean.charAt(i+1) + " ";
                //to go two characters forward not only one
                i++;
            }
        }

        sUpper = toUpperCase(sClean);
        return sUpper;
    }

    /**
     * method to look if a given character is in a string
     * @param s
     * @param character
     * @return true if the character is in the string, false if not
     */
    private boolean characterInString(String s, Character character) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }

    /**
     * method to convert a string to uppercase
     * @param s string to convert
     * @return the string in uppercase
     */
    private String toUpperCase(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += Character.toUpperCase(s.charAt(i));
        }
        return newString;
    }
}
