package Aufgabe6_2;
/**
 * @author Walter, Annika; Baun, Niklas
 */

public class Aufgabe6_2 {
    public static void main(String[] args) {
        Playfair playfair = new Playfair("Apfelstrudel");
        System.out.println(playfair.printSquare());
        System.out.println(playfair.encode("Mittwoch"));
    }
}
