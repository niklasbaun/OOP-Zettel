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
}
