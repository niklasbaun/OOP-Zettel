/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class Reverse {

    /**
     * if a String is a Palindrom
     *
     * @param a the String to check
     * @return true if it is; false if not
     */
    public static boolean isReverse(String a, String b) {
        //sort out cases where comparing wouldn´t be necessary
        if (a.isEmpty() || b.isEmpty() || a.length() != b.length() || a.length() == 0 || b.length() == 0) {
            return false;
        }
        if ( a.length() == 1) {
            return true;
        }

        //make unified
        //set the String to lower case to ignore case sensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();
        //remove tabs, spaces and new lines from the String
        a = a.replaceAll("\\s+", "");
        b = b.replaceAll("\\s+", "");
        //remove all punctuation from the String
        a = a.replaceAll("\\p{Punct}", "");
        b = b.replaceAll("\\p{Punct}", "");


        //loop backwards through the String
        for (int i = a.length() - 1; i >= 0; i--) {
            for (int j = 0; j <= b.length(); j++) {
                //check if char at pos i in "a" is equal to char at pos j in "b"
                if (a.charAt(i) != b.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
