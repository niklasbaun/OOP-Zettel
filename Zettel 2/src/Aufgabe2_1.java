public class Aufgabe2_1 {
    public static void main(){
        //a)
        //Erwarteter Wert: 1336
        predecessor(1337);
        //Erwarteter Wert: -1
        predecessor(0);
        //Erwarteter Wert: 2147483647
        predecessor(-2147483648);

        isequal("Ct", "Ct");
        //b)
    }
    //methods to solve Aufgabe 2.1 a) and b)
    static int predecessor(int num){
        return num-1;
    }

    static boolean isequal(String word1, String word2){
        return word1 == word2;
    }
}
