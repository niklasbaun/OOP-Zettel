package Aufgabe6_2;

/**
 * @author Walter, Annika; Baun, Niklas
 */
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
        //create pairs of the chars in sClean
        for(int i=0; i < sClean.length(); i++ ){
            if(i%2 == 0){
                sPair = sPair + sClean.charAt(i);
            }
            else{
                if(sClean.charAt(i) == sClean.charAt(i-1)){
                    sPair = sPair + "X" + sClean.charAt(i);
                }
                else{
                    sPair = sPair + sClean.charAt(i);
                }
            }
        }
        //if the last char is alone, add an A
        if(sPair.length()%2 != 0){
            sPair = sPair + "A";
        }
        //separat the pairs with a space
        for(int i=0; i < sPair.length(); i++){
            if(i%2 == 0){
                sUpper = sUpper + sPair.charAt(i);
            }
            else{
                sUpper = sUpper + sPair.charAt(i) + " ";
            }
        }
        //return the string in uppercase
        return toUpperCase(sUpper);
    }

    /**
     * method to encrypt a string with the playfair rules
     *             - if the string is empty, return null
     *             - if the string is not empty, return the encrypted string
     * @param word the string
     * @return the encrypted string
     */
    public String encode(String word){
        String sClean = cleanWord(word);
        String sEncrypted = "";
        //encrypt the word
        for(int i=0; i < sEncrypted.length(); i++){
            if(i%2 == 0){
                Position pos1 = findInSquare(sEncrypted.charAt(i));
                Position pos2 = findInSquare(sEncrypted.charAt(i+1));
                //if both are in the same row
                if(pos1.getX() == pos2.getX()){
                    sEncrypted = sEncrypted.substring(0, i) + playfairSquare[pos1.getX()][(pos1.getY()+1)%5] + playfairSquare[pos2.getX()][(pos2.getY()+1)%5] + sEncrypted.substring(i+2);
                }
                //of both are in the same column
                else if(pos1.getY() == pos2.getY()){
                    sEncrypted = sEncrypted.substring(0, i) + playfairSquare[(pos1.getX()+1)%5][pos1.getY()] + playfairSquare[(pos2.getX()+1)%5][pos2.getY()] + sEncrypted.substring(i+2);
                }
                else{
                    sEncrypted = sEncrypted.substring(0, i) + playfairSquare[pos1.getX()][pos2.getY()] + playfairSquare[pos2.getX()][pos1.getY()] + sEncrypted.substring(i+2);
                }
            }
        }
        return sEncrypted;
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
