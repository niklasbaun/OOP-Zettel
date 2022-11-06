public class Aufgabe2_1 {
    public static void main(){
        //a)
        //Erwarteter Wert: 1336, da 1337-1 = 1336 ist.
        predecessor(1337);
        //Erwarteter Wert: -1, da 0 -1 = -1 ist.
        predecessor(0);
        //Erwarteter Wert: 2147483647, -2147483648 ist die niedrigste Integer, die dargestellt werden kann.
        //Wenn von dieser Zahl noch 1 abgezogen wird, fängt die Zahl wieder von dem höchstmöglichen Wert an zu Zählen.
        predecessor(-2147483648);


        //b)
        //Erwartet: False, da nicht das gleiche Wort
        isEqual("Cthulu", "Nyarlathop");
        //Erwartet: True, da es das gleiche Wort ist
        isEqual("Lovecraft", "Lovecraft");
        //Erwartet: False, da bei new String, explizit eine neue Instanz eines Strings erzeugt wird.
        isEqual("Howard", new String("Howard"));
    }

    //methods to solve Aufgabe 2.1 a) and b)
    static int predecessor(int num){
        return num-1;
    }

    static boolean isEqual(String word1, String word2){
        return word1 == word2;
    }
}
