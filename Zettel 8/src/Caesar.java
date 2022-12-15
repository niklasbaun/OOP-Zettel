public class Caesar {
   static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";




    /**
     * method to return the shifted alphabet
     */
    private static String shiftAlphabet(char a, char b) {
        String shiftedAlphabet = "";
        int shift = alphabet.indexOf(Character.toUpperCase(b)) - alphabet.indexOf(Character.toUpperCase(a));
        //convert shift to a positve movement
        if(shift < 0) {
            shift = alphabet.indexOf(Character.toUpperCase(a)) - alphabet.indexOf(Character.toUpperCase(b));
        }
        for (int i = 0; i < alphabet.length(); i++) {
            shiftedAlphabet += alphabet.charAt((i + shift) % alphabet.length());
        }
        return shiftedAlphabet;
    }
    /**
     * method to decode a text encoded with the caesar cipher
     * by setting a char to a different char
     * @param coded the coded text
     * @param a letter in the coded text
     * @param b letter in the decoded text
     * @return the decoded text
     */
    public static String decode(String coded, char a, char b){
        String decoded = "";
        //shift the alphabet
        String shiftedAlphabet = shiftAlphabet(a, b);
        //decode the text
        for (int i = 0; i < coded.length(); i++) {
            char c = coded.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                decoded += shiftedAlphabet.charAt(alphabet.indexOf(c));
            } else {
                decoded += c;
            }
        }
        return decoded;
    }


    public static void main(String[] args) {
        System.out.println(alphabet);
        System.out.println(shiftAlphabet('E', 'c'));
        System.out.println(decode("HGXBO", 'w', 'z'));
    }
}
