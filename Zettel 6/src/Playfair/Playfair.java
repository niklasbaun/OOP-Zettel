package Playfair;

public class Playfair {
    private final char[][] playfairSquare ;
    private final String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Playfair(char[][] playfairSquare) {
        this.playfairSquare = playfairSquare;
    }


    private boolean characterInString(String s, Character character) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }

    private String toUpperCase(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += Character.toUpperCase(s.charAt(i));
        }
        return newString;
    }
}
