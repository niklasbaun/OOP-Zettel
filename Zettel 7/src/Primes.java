/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class Primes {
    /**
     * main method to call the primesUpTo method and testmethod
     * @param args
     */
    public static void main(String[] args) {
        prettyPrint(primesUpTo(100));
        //testmethod
        testPrimesUpTo();
    }

    /**
     * method to count how often a number is in a given array
     * @param arr the array to check
     * @param number the number to look for
     * @return the number of times the number is in the array
     */
    public static int count(int[] arr, int number) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                result++;
            }
        }
        return result;
    }

    /**
     * method to filter an Array and remove all numbers that are given in the filter
     * @param arr the array to filter
     * @param filter the numbers to remove
     * @return the filtered array
     */
    public static int[] filterArr(int[] arr, int filter) {
        int[] result = new int[arr.length - count(arr, filter)];
        int resultIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != filter) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }
        return result;
    }

    /**
     * method to add all numbers between start and end to an array
     * @param start the starting number to add
     * @param end the last number to add
     * @return the array with all numbers between start and end
     */
    public static int[] countFromTo(int start, int end) {
        if(end < start) {
            return new int[0];
        }
        int[] num = new int[end - start + 1];
        for(int i = 0; i < num.length; i++) {
            num[i] = i + start;
        }
        return num;
    }

    /**
     * method to find all prime numbers in a given range
     *          - if the range is empty, return null
     *          - if the range is not empty, return the prime numbers in the range
     * @param number the upper limit of the range
     * @return an array with all prime numbers
     */
    public static int[] primesUpTo(int number) {
        if (number < 0){
            System.out.println("Error: number must be positive");
            return null;
        } else if (number < 2) {
            System.out.println("Error: number under 2 are not prime");
            return new int[0];
        }
        return primesUpToH(number, countFromTo(2, number), 2, 0);
    }

    /**
     * helper method for primesUpTo
     * @param number the upper limit
     * @param toBeFiltered the array to filter
     * @param current the current number to filter
     * @param pos the position of the current number in the array
     * @return the array with all prime numbers
     */
    public static int[] primesUpToH(int number, int[] toBeFiltered, int current, int pos) {
        if(current >= Math.sqrt(number) + 2 || current >= number) {
            return toBeFiltered;
        }
        for(int i = pos + 1; i < toBeFiltered.length; i++){
            if(toBeFiltered[i] % current == 0) {
                toBeFiltered[i] = -1;
            }
        }
        int[] filtered = filterArr(toBeFiltered, -1);
        return primesUpToH(number, filtered, filtered[pos + 1], pos + 1);
    }

    /**
     * method to print an array
     * @param arr the array to print
     */
    public static void prettyPrint(int[] arr) {
        System.out.print("{");
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "}\n");
    }

    /**
     * method to test the primesUpTo method
     *      - test for numbers up to 100
     *      - test for numbers under 2
     *      - test for negative numbers
     *      - test for numbers up to 50
     */
    static void testPrimesUpTo(){
        int[] primes = primesUpTo(100);
        int[] primesExpected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        if (primes.length != primesExpected.length) {
            System.out.println("testPrimesUpTo 100 failed: length of primes is not as expected");
        }
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != primesExpected[i]) {
                System.out.println("testPrimesUpTo 100 failed: primes is not as expected");
                break;
            }
        }
        System.out.println("testPrimesUpTo 100 passed");

        System.out.println("========================================");
        int[] primes2 = primesUpTo(0);
        if (primes2.length != 0) {
            System.out.println("testPrimesUpTo 0 failed: length of primes is not as expected");
        } else {
            System.out.println("testPrimesUpTo 0 passed");
        }

        System.out.println("========================================");
        int[] primes3 = primesUpTo(1);
        if (primes3.length != 0) {
            System.out.println("testPrimesUpTo 1 failed: length of primes is not as expected");
        } else {
            System.out.println("testPrimesUpTo 1 passed");
        }

        System.out.println("========================================");
        int[] primes4 = primesUpTo(-1);
        if (primes4 != null) {
            System.out.println("testPrimesUpTo -1 failed: primes is not as expected");
        } else {
            System.out.println("testPrimesUpTo -1 passed");
        }

        System.out.println("========================================");
        int[] primes5 = primesUpTo(50);
        int[] primesExpected5 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        if (primes5.length != primesExpected5.length) {
            System.out.println("testPrimesUpTo 50 failed: length of primes is not as expected");
        }
        for (int i = 0; i < primes5.length; i++) {
            if (primes5[i] != primesExpected5[i]) {
                System.out.println("testPrimesUpTo 50 failed: primes is not as expected");
                break;
            }
        }
        System.out.println("testPrimesUpTo 50 passed");

    }
}
