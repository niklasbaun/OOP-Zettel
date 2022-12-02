package Aufgabe6_2;
/**
 * @author Walter, Annika; Baun, Niklas
 */
public class Aufgabe6_2 {
    public static void main(String[] args) {
        Playfair playfair1= new Playfair("Apfelstrudel");
        System.out.println(playfair1.printSquare()); //erwarteter Wert: A P F E L  S T R U D  E L B C G  H I K M N  O Q V W X
        System.out.println(playfair1.encode("Es ist Mittwoch")); //erwarteter Wert: AUHTUIQLUQWEOS

        Playfair playfair2= new Playfair("Codeword");
        System.out.println(playfair2.printSquare()); //erwarteter Wert: C O D E W  R A B F G  H I K L M  N P Q S T  U V X Y Z
        System.out.println(playfair2.encode("Hallo Welt")); //erwarteter Wert: HZLXWZLX
    }

    /**
     * method to test the playfair algorithm
     */
    private static void testPlayfair(){
        //playfair1
        Playfair playfair1= new Playfair("Apfelstrudel");
        //test square
        if(playfair1.printSquare().equals("A P F E L  S T R U D  E L B C G  H I K M N  O Q V W X")){
            System.out.println("Test 1 Playfair1 passed");
        }else{
            System.out.println("Test 1 Playfair1 failed");
        }
        //test encode
        if(playfair1.encode("Es ist Mittwoch").equals("AUHTUIQLUQWEOS")){
            System.out.println("Test 2 Playfair1 passed");
        }else{
            System.out.println("Test 2 Playfair1 failed");
        }
        //playfair 2
        Playfair playfair2= new Playfair("Codeword");
        //test square
        if(playfair2.printSquare().equals("C O D E W  R A B F G  H I K L M  N P Q S T  U V X Y Z")){
            System.out.println("Test 1 Playfair2 passed");
        }else{
            System.out.println("Test 1 Playfair2 failed");
        }
        //test encode
        if(playfair2.encode("Hallo Welt").equals("HZLXWZLX")){
            System.out.println("Test 2 Playfair2 passed");
        }else{
            System.out.println("Test 2 Playfair2 failed");
        }
        //Playfair 3
        Playfair playfair3= new Playfair("Hallo Welt");
        //test square
        if(playfair3.printSquare().equals("H A L L O  W E B C D  F G I K M  N P Q R S  T U V X Y Z")){
            System.out.println("Test 1 Playfair3 passed");
        }else{
            System.out.println("Test 1 Playfair3 failed");
        }
        //test encode
        if(playfair3.encode("Hallo Welt").equals("HZLXWZLX")){
            System.out.println("Test 2 Playfair3 passed");
        }else{
            System.out.println("Test 2 Playfair3 failed");
        }
    }
}
