public class Aufgabe2_2 {
    public static void main (String[] args) {
        System.out.println("Start of whole program");
        methode_1();
        System.out.println("End of whole program");
    }

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
}
