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
    static String replace(String source, String search, String replace){
        //check if any input is empty
        if(source == null || search == null || replace == null){
            return null;
        }
        //result String to return
        String result = "";
        int pos = 0;
        //check whether the search string is even in the source string
        int index = source.indexOf(search);
        //if not return the source string
        if(index == -1){
            return source;
        }
        //if there is then loop until all occurences are replaced
        while((pos = source.indexOf(search, pos)) > 0){
            //add the part of the source string before the search string to the result string
            result += source.substring(0, pos);
            //add the replace string to the result string
            result += replace;
            //remove the part of the source string before the search string and the search string itself
            source = source.substring(pos + search.length());
        }
        //add the rest of the source string to the result string
        result += source;
        return result;
    }
}
