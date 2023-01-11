/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class Replacement {

    /**
     * method to find a substring in source which matches the search String and replace it with the replace String
     * @param source the String to search in
     * @param search the String to search for
     * @param replace the String to replace the search String with
     * @return the source String with the search String replaced with the replace String
     */
    String replace(String source, String search, String replace){
        //check if the search String is in the source String
        if (source.contains(search)){
            //create a new String to store the result
            String result = "";
            //loop through the source String
            for (int i = 0; i < source.length(); i++) {
                //check if the current character is the first character of the search String
                if (source.charAt(i) == search.charAt(0)){
                    //check if the search String is in the source String
                    if (source.substring(i, i + search.length()).equals(search)){
                        //add the replace String to the result String
                        result += replace;
                        //skip the search String
                        i += search.length() - 1;
                    } else {
                        //add the current character to the result String
                        result += source.charAt(i);
                    }
                } else {
                    //add the current character to the result String
                    result += source.charAt(i);
                }
            }
            //return the result String
            return result;
        } else {
            //return the source String if nothing matches
            return source;
        }
    }
}
