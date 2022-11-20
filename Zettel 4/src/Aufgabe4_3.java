public class Aufgabe4_3 {
    public static void main(String[] args) {
        testKrt();
    }

    /**
     * calls the recursiv method to calculate the nth root of a given number with Herons algorithm
     * @param a number to calculate the root of
     * @param k nth root
     * @param d precision
     * @return the nth root of a given number
     */
    static double krt(double a, double k, double d) {
        if (a <= 0){
            return 0;
        }else {
            return krtH(a, k, d, a);
        }
    }

    /**
     * calculates the nth root of a given number with Herons algorithm
     * @param a number to calculate the root of
     * @param k nth root
     * @param d precision
     * @param x_n current guess
     * @return the nth root of a given number
     */
    static double krtH(double a, double k, double d, double x_n) {
        if(Math.abs(x_n-((1 / k) * ((k - 1) * x_n + a / Math.pow(x_n, k - 1)))) < d) {
            return (1 / k) * ((k - 1) * x_n + a / Math.pow(x_n, k - 1));
        } else {
            return krtH(a, k, d, ((1 / k) * ((k - 1) * x_n + a / Math.pow(x_n, k - 1))));
        }
    }

    /**
     * tests the method krt with different values
     * values where calculated with https://www.wolframalpha.com/input
     */
    static void testKrt(){
        double test1Value = krt(2, 2, 0.00004);
        if (test1Value == 1.4142135623730950){
            System.out.println("Test 1 passed");
        }else{
            System.out.println("Test 1 failed");
            System.out.println("Expected: 1.4142135623730950");
            System.out.println("Actual: " + test1Value);
        }
        double test2Value = krt(5, 3, 0.003);
        if (test2Value == 1.7099759466766969){
            System.out.println("Test 2 passed");
        }else{
            System.out.println("Test 2 failed");
            System.out.println("Expected: 1.7099759466766969");
            System.out.println("Actual: " + test2Value);
        }
        double test3Value = krt(70, 4, 0.006);
        if (test3Value == 2.892507608519077){
            System.out.println("Test 3 passed");
        }else{
            System.out.println("Test 3 failed");
            System.out.println("Expected: 2.892507608519077");
            System.out.println("Actual: " + test3Value);
        }
    }

}
