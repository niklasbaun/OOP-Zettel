public class Aufgabe2_2 {
    public static void main (String[] args) {
        System.out.println("Start of whole program");
        methode_1();
        System.out.println("End of whole program");
    }


    /*
    * Erwartete Reihenfolge:
        1. Enter Methode 1
        2. Enter Methode 2_1
        3. Enter Methode 2_2
        4. Enter Methode 3
        5. Exit Methode 3
        6. Exit Methode 2_2
        7. Exit Methode 2_1
        8. Enter Methode 2_2
        9. Enter Methode 3
        10. Exit Methode 3
        11. Exit Methode 2_2
        12. Exit Methode 1
    */
    static void methode_1() {
        System.out.println("Enter Method 1");
        methode_2_1();
        methode_2_2();
        System.out.println("Exit Method 1");
    }

    static void methode_2_1() {
        System.out.println("Enter Method 2_1");
        methode_2_2();
        System.out.println("Exit Method 2_1");
    }

    static void methode_2_2() {
        System.out.println("Enter Method 2_2");
        methode_3();
        System.out.println("Exit Method 2_2");
    }

    static void methode_3() {
        System.out.println("Enter Method 3");
        System.out.println("Exit Method 3");
    }

    /*
    Ausgabe:
    Start of whole program
    Enter Method 1
    Enter Method 2_1
    Enter Method 2_2
    Enter Method 3
    Exit Method 3
    Exit Method 2_2
    Exit Method 2_1
    Enter Method 2_2
    Enter Method 3
    Exit Method 3
    Exit Method 2_2
    Exit Method 1
    End of whole program
     */
}
