public class Aufgabe3_3 {
    public static void main(String[] args) {
        //test piIterative
        System.out.println("Testing piIterative");
        testPiIterative();

        //test piRecursive
        System.out.println("Testing piRecursive");
        testPiIterative();
    }
    static double piIterative(final int n) {
        double result = Math.sqrt(12);
        int count = 0;
        while(count < n) {
            result += Math.sqrt(12) * ((Math.pow(-0.33, n)) / (2 * count + 1));
            count += 1;
        }
        return result;
    }
    static double piRecursive(final int n) {
        if(n == 0) {
            return Math.sqrt(12);
        } else {
            return Math.sqrt(12) * ((Math.pow(-0.33, n)) / (2 * n + 1) + piRecursive(n - 1));
        }
    }

    static void testPiIterative() {
        if (piIterative(3) == 3.141592653589793) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        if (piIterative(10) == 3.141592653589793) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        if (piIterative(0) == Math.sqrt(12)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    static void testPiRecursive(int n) {
        if (piRecursive(3) == 3.141592653589793) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        if (piRecursive(10) == 3.141592653589793) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        if (piRecursive(0) == 0) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
