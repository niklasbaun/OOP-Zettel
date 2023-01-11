/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class Palindrom {

    /**
     * if a String is a Palindrom
     * @param a the String to check
     * @return true if it is; false if not
     */
    public static boolean isReverse(String a){
        //sort out special cases
        if (a.isEmpty()){
            return false;
        }
        if (a.length() == 0 || a.length() == 1){
            return true;
        }

        //make unified
        //set the String to lower case to ignore case sensitivity
        a = a.toLowerCase();
        //remove tabs, spaces and new lines from the String
        a = a.replaceAll("\\s+","");
        //remove all punctuation from the String
        a = a.replaceAll("\\p{Punct}","");

        //create the reverse String
        String b = "";
        //loop backwards through the String
        for (int i = a.length()-1; i >= 0; i--) {
            //place character at the position
            b += a.charAt(i);
        }
        //for visibility
        System.out.println(a);
        System.out.println(b);
        //check if the word backwards matches the inputted word
        return a == b;
    }
}
