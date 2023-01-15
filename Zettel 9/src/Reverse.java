public class Reverse {

    /**
     * method to look if one string is the reverse of another
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isReverse(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
