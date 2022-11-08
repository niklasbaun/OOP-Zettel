public class Aufgabe3_3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    static double piIterative(final int n) {
        double result = 0;
        int count = 0;
        while(count < n) {
            result += Math.sqrt(12) * ((Math.pow(-0.33, n)) / (2 * count + 1));
            count += 1;
        }
        return result;
    }
    static double piRecursive(final int n) {
        if(n == 0) {
            return 0;
        } else {
            return Math.sqrt(12) * ((Math.pow(-0.33, n)) / (2 * n + 1) + piRecursive(n - 1));
        }
    }
}
