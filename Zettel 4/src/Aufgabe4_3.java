public class Aufgabe4_3 {
    public static void main(String[] args) {
        System.out.println(krt(4, 2, 0.001));
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
            return krtH(a, k, d, 0);
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
        if (d == 0) {
            return a;
        } else if(Math.abs(x_n-(x_n-1)) < d) {
            return x_n;
        } else {
            return krtH(a, k, d, ((1 / k) * ((k - 1) * (x_n+1) + a / Math.pow(x_n+1, k - 1)))+x_n);
        }
    }

    /**
     * tests the method krt with different values
     */
    static void testKrt(){
        double test1Value = krt(2, 2, 0.0001);
        if (test1Value == 1.4142){
            System.out.println("Test 1 passed");
        }else{
            System.out.println("Test 1 failed");
            System.out.println("Expected: 1.4142");
            System.out.println("Actual: " + test1Value);
        }
        double test2Value = krt(2, 3, 0.0001);
        if (test2Value == 1.2599){
            System.out.println("Test 2 passed");
        }else{
            System.out.println("Test 2 failed");
            System.out.println("Expected: 1.2599");
            System.out.println("Actual: " + test2Value);
        }
        double test3Value = krt(2, 4, 0.0001);
        if (test3Value == 1.1892){
            System.out.println("Test 3 passed");
        }else{
            System.out.println("Test 3 failed");
            System.out.println("Expected: 1.1892");
            System.out.println("Actual: " + test3Value);
        }
    }

}
