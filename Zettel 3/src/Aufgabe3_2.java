public class Aufgabe3_2 {

    public static void main(String[] args) {
        System.out.println(postage(1, 2, 3, 4));
        testPostage();
    }


    /**
     * Calculates the postage for a package
     * @param weight the weight of the package
     * @param length the length of the package
     * @param width the width of the package
     * @param height the height of the package
     * @return the postage for the package
     */
    static int postage(int length, int width, int height, int weight) {
        //Postkarte
        if ((isBetween(length, 140, 235))&&(isBetween(width, 90, 125))&&(height<=2)&&(weight<=15)) {
            return 70;
        } //Standard
        else if ((isBetween(length, 140, 235))&&(isBetween(width, 90, 125))&&(height<=5)&&(weight<=20)) {
            return 85;
        } //Kompakt
        else if ((isBetween(length, 100, 235))&&(isBetween(width, 70, 125))&&(height<=10)&&(weight<=50)) {
            return 100;
        } //Groß
        else if ((isBetween(length, 100, 353))&&(isBetween(width, 70, 250))&&(height<=20)&&(weight<=500)) {
            return 160;
        } //Maxi
        else if ((isBetween(length, 100, 353))&&(isBetween(width, 70, 250))&&(height<=50)&&(weight<=1000)) {
            return 275;
        } else {
            return -1;
        }
    }
    /**
     * Checks if a number is between two other numbers
     * @param value the number to check
     * @param lower the lower bound
     * @param upper the upper bound
     * @return true if the number is between the bounds, false otherwise
     */
    static boolean isBetween(int value, int lower, int upper) {
        if (value >= lower && value <= upper) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests the postage method
     * @return true if the test passed, false if the test failed
     * 6 tests
     * 1. Postkarte, tests of input is between the limits of "Postkarte" limits
     * 2. Standard, tests of input is between the limits of "Standard" limits
     * 3. Kompakt, tests of input is between the limits of "Kompakt" limits
     * 4. Groß, tests of input is between the limits of "Groß" limits
     * 5. Maxi, tests of input is between the limits of "Maxi" limits
     * 6. Error, tests of input is out of the limits of all postage types
     */
    static void testPostage() {
        //Testfall1, Postkarte
        final boolean b = postage(160, 100, 1, 4) == 70;
        if(b) System.out.println("Test 1 passed");
        else System.out.println("Test 1 failed");
        //Testfall2, Standard
        final boolean b2 = postage(160, 100, 4, 16) == 85;
        if(b2) System.out.println("Test 2 passed");
        else System.out.println("Test 2 failed");
        //Testfall3, Kompakt
        final boolean b3 = postage(160, 80, 8, 40) == 100;
        if(b3) System.out.println("Test 3 passed");
        else System.out.println("Test 3 failed");
        //Testfall4, Groß
        final boolean b4 = postage(250, 140, 12, 300) == 160;
        if(b4) System.out.println("Test 4 passed");
        else System.out.println("Test 4 failed");
        //Testfall5, Maxi
        final boolean b5 = postage(250, 140, 30, 800) == 275;
        if(b5) System.out.println("Test 5 passed");
        else System.out.println("Test 5 failed");
        //Testfall6, Fehler
        final boolean b6 = postage(500 , 500, 500, 2000) == -1;
        if(b6) System.out.println("Test 6 passed");
        else System.out.println("Test 6 failed");
    }
}

