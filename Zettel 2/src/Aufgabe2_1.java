public class Aufgabe2_1 {
    public static void main(String[] args){
        //a)
        //Erwarteter Wert: 1336
        System.out.println(predecessor(1337));
        //Erwarteter Wert: -1
        System.out.println(predecessor(0));
        //Erwarteter Wert: 2147483647
        System.out.println(predecessor(-2147483648));


        //b)
        //Erwartet: False
        System.out.println(isEqual("Cthulu", "Nyarlathop"));
        //Erwartet: True
        System.out.println(isEqual("Lovecraft", "Lovecraft"));
        //Erwartet: False, da bei new String, explizit eine neue Instanz eines Strings erzeugt wird.
        System.out.println(isEqual("Howard", new String("Howard")));
    }
    //methods to solve Aufgabe 2.1 a) and b)
    static int predecessor(int num){
        return num-1;
    }

    static boolean isEqual(String word1, String word2){
        return word1 == word2;
    }
}
