/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class Aufgabe7_1 {

    /**
     * main method to call the primesUpTo method and testmethod
     * @param args
     */
    public static void main(String[] args) {
        int[] primes = primesUpTo(100);
        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }
        testPrimesUpTo();
    }

    /**
     * method to find all prime numbers in a given range
     *          - if the range is empty, return null
     *          - if the range is not empty, return the prime numbers in the range
     * @param n the range
     * @return an array with all prime numbers
     */
    static int[] primesUpTo(int n) {
        //check if n is a valid number
        if (n < 0) {
            System.out.println("n must be greater than 0");
            return null;
        } else if (n == 0 || n == 1) {
            return new int[0];
        } else {
            //list all numbers up to n in array
            int[] numbers = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                numbers[i] = i;
            }
            int[] numbersWithoutMultiples = new int[n - 2];
            int counter = 0;
            //start at 2, because 0 and 1 are not prime numbers
            for (int i = 2; i < n - 2; i++) {
                //check if the number is not already 0
                if (numbers[i] != 0) {
                    numbersWithoutMultiples[counter] = numbers[i];
                    counter++;
                    for (int j = i + 1; j < n-2; j++) {
                        //if the number is a multiple of the current number, set it to 0
                        if (numbers[j] % numbers[i] == 0) {
                            numbers[j] = 0;
                        }
                    }
                }
            }
            //remove all 0s from the array
            int[] primes = new int[counter];
            for (int i = 0; i < counter; i++) {
                primes[i] = numbersWithoutMultiples[i];
            }

            return primes;
        }
    }

    /**
     * method to test the primesUpTo method
     * @return true if the method works, false if not
     */
    static void testPrimesUpTo(){
        int[] primes = primesUpTo(100);
        int[] primesExpected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        if (primes.length != primesExpected.length) {
            System.out.println("testPrimesUpTo 100 failed: length of primes is not as expected");
            return;
        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != primesExpected[i]) {
                System.out.println("testPrimesUpTo 100 failed: primes is not as expected");
                return;
            }
        }
        System.out.println("testPrimesUpTo 100 passed");

        System.out.println("========================================");
        int[] primes2 = primesUpTo(0);
        if (primes2.length != 0) {
            System.out.println("testPrimesUpTo 0 failed: length of primes is not as expected");
            return;
        }
        System.out.println("testPrimesUpTo 0 passed");

        System.out.println("========================================");
        int[] primes3 = primesUpTo(1);
        if (primes3.length != 0) {
            System.out.println("testPrimesUpTo 1 failed: length of primes is not as expected");
            return;
        }
        System.out.println("testPrimesUpTo 1 passed");

        System.out.println("========================================");
        int[] primes4 = primesUpTo(-1);
        if (primes4 != null) {
            System.out.println("testPrimesUpTo -1 failed: primes is not as expected");
            return;
        }
        System.out.println("testPrimesUpTo -1 passed");

        System.out.println("========================================");
        int[] primes5 = primesUpTo(50);
        int[] primesExpected5 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        if (primes5.length != primesExpected5.length) {
            System.out.println("testPrimesUpTo 50 failed: length of primes is not as expected");
            return;
        }
        for (int i = 0; i < primes5.length; i++) {
            if (primes5[i] != primesExpected5[i]) {
                System.out.println("testPrimesUpTo 50 failed: primes is not as expected");
                return;
            }
        }
        System.out.println("testPrimesUpTo 50 passed");

    }
}
