public class Aufgabe7_1 {
    private static int[] primesUpTo(int n) {
        //check if n is a valid number
        if (n < 0) {
            System.out.println("n must be greater than 0");
            return null;
        }
        //list all numbers up to n in array
        int[] numbers = new int[n+1];
        for (int i = 0; i <= n; i++) {
            numbers[i] = i;
        }
        //remove 0 and 1 from the array
        int[] numbersWithout0And1 = new int[n - 2];
        for (int i = 0; i < n - 2; i++) {
            numbersWithout0And1[i] = numbers[i + 2];
        }
        //remove all multiples of all numbers up to sqrt(n)+2 from the array
        // by replacing all multiples with 0
        int[] numbersWithoutMultiples = new int[n - 2];
        int counter = 0;
        for (int i = 0; i < n - 2; i++) {
            if (numbersWithout0And1[i] != 0) {
                numbersWithoutMultiples[counter] = numbersWithout0And1[i];
                counter++;
                for (int j = i + 1; j < n - 2; j++) {
                    if (numbersWithout0And1[j] % numbersWithout0And1[i] == 0) {
                        numbersWithout0And1[j] = 0;
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

    public static void main(String[] args) {
        int[] primes = primesUpTo(100);
        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }
    }

    static void testPrimesUpTo(){
        int[] primes = primesUpTo(100);
        int[] primesExpected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        if (primes.length != primesExpected.length) {
            System.out.println("testPrimesUpTo failed: length of primes is not as expected");
            return;
        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != primesExpected[i]) {
                System.out.println("testPrimesUpTo failed: primes is not as expected");
                return;
            }
        }
        System.out.println("testPrimesUpTo passed");
    }
}
