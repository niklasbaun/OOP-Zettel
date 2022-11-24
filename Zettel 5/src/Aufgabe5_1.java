public class Aufgabe5_1 {

    public static void main(String[] args) {
        testAll();
    }

    static void testAll(){
        System.out.println("Tests for getMinimum");
        //test 1 for getMinimum
        float[] arrMin1 = {1, 2, 3, 4, 5};
        float min1 = 1;
        if (min1 == getMinimum(arrMin1)) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
            System.out.println("Expected Value " + min1);
            System.out.println("Actual Value " + getMinimum(arrMin1));
        }
        //test 2 for getMinimum
        float[] arrMin2 = {4.5F, -1.2F, 5, 7.6F, 10};
        float min2 = (float) -1.2;
        if (min2 == getMinimum(arrMin2)) {
            System.out.println("Test 2 passed");
        } else {
            System.out.println("Test 2 failed");
            System.out.println("Expected Value " + min2);
            System.out.println("Actual Value " + getMinimum(arrMin2));
        }
        //test 3 for getMinimum
        float[] arrMin3 = {1000, 500, 2000, 3000, 1500};
        int min3 = 500;
        if (min3 == getMinimum(arrMin3)) {
            System.out.println("Test 3 passed");
        } else {
            System.out.println("Test 3 failed");
            System.out.println("Expected Value " + min3);
            System.out.println("Actual Value " + getMinimum(arrMin3));
        }

        System.out.println("--------------------");
        System.out.println("Tests for getMaximum");
        //test 1 for getMaximum
        float[] arrMax1 = {4.5F, 1.2F, 5, 7.3F};
        float max1 = 7.3F;
        if (max1 == getMaximum(arrMax1)) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
            System.out.println("Expected Value " + max1);
            System.out.println("Actual Value " + getMaximum(arrMax1));
        }
        //test 2 for getMaximum
        float[] arrMax2 = {-44, -13, -25, -7};
        int max2 = -7;
        if (max2 == getMaximum(arrMax2)) {
            System.out.println("Test 2 passed");
        } else {
            System.out.println("Test 2 failed");
            System.out.println("Expected Value " + max2);
            System.out.println("Actual Value " + getMaximum(arrMax2));
        }
        //test 3 for getMaximum
        float[] arrMax3 = {500, 1000, 2000, 3000};
        float max3 = 3000;
        if (max3 == getMaximum(arrMax3)) {
            System.out.println("Test 3 passed");
        } else {
            System.out.println("Test 3 failed");
            System.out.println("Expected Value " + max3);
            System.out.println("Actual Value " + getMaximum(arrMax3));
        }

        System.out.println("--------------------");
        System.out.println("Tests for getAverage");
        //test 1 for getAverage
        float[] arrAvg1 = {4, 1, 5, 6};
        float avg1 = 4;
        if (avg1 == calculateAverage(arrAvg1)) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
            System.out.println("Expected Value " + avg1);
            System.out.println("Actual Value " + calculateAverage(arrAvg1));
        }
        //test 2 for getAverage
        float[] arrAvg2 = {4, 1, 5, 6, 10};
        float avg2 = 5.2F;
        if (avg2 == calculateAverage(arrAvg2)) {
            System.out.println("Test 2 passed");
        } else {
            System.out.println("Test 2 failed");
            System.out.println("Expected Value " + avg2);
            System.out.println("Actual Value " + calculateAverage(arrAvg2));
        }
        //test 3 for getAverage
        float[] arrAvg3 = {-4.1F, -11.4F, -13, -16.2F, -10, -5.3F};
        float avg3 = -10;
        if (avg3 == calculateAverage(arrAvg3)) {
            System.out.println("Test 3 passed");
        } else {
            System.out.println("Test 3 failed");
            System.out.println("Expected Value " + avg3);
            System.out.println("Actual Value " + calculateAverage(arrAvg3));
        }

        float[] arrAvg4 = {0.01F, 0.29F, 0.4F, 0.3F};
        float avg4 = 0.25F;
        if (avg4 == calculateAverage(arrAvg4)) {
            System.out.println("Test 4 passed");
        } else {
            System.out.println("Test 4 failed");
            System.out.println("Expected Value " + avg4);
            System.out.println("Actual Value " + calculateAverage(arrAvg4));
        }

        System.out.println("--------------------");
        System.out.println("Tests for isSorted");
        //test 1 for isSorted
        float[] arrSort1 = {1, 2, 3, 4, 5};
        boolean sorted1 = true;
        if (sorted1 == isSorted(arrSort1, true)) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
            System.out.println("Expected Value " + sorted1);
                System.out.println("Actual Value " + isSorted(arrSort1, true));
        }

        //test 2 for isSorted
        float[] arrSort2 = {5, 4, 3, 2, 1};
        boolean sorted2 = true;
        if (sorted2 == isSorted(arrSort2, false)) {
            System.out.println("Test 2 passed");
        } else {
            System.out.println("Test 2 failed");
            System.out.println("Expected Value " + sorted2);
            System.out.println("Actual Value " + isSorted(arrSort2, false));
        }

        //test 3 for isSorted
        float[] arrSort3 = {-7, -4, -2.6F, -2, -1};
        boolean sorted3 = true;
        if (sorted3 == isSorted(arrSort3, true)) {
            System.out.println("Test 3 passed");
        } else {
            System.out.println("Test 3 failed");
            System.out.println("Expected Value " + sorted3);
            System.out.println("Actual Value " + isSorted(arrSort3, true));
        }

        //test 4 for isSorted
        float[] arrSort4 = {7.8F, 4.5F, 2.6F, 2.1F, 1.2F};
        boolean sorted4 = false;
        if (sorted4 == isSorted(arrSort4, true)) {
            System.out.println("Test 4 passed");
        } else {
            System.out.println("Test 4 failed");
            System.out.println("Expected Value " + sorted4);
            System.out.println("Actual Value " + isSorted(arrSort4, true));
        }
    }

    /**
     * finds the smallest number in the array recursively
     * @param numbers
     * @return
     */
    static float getMinimum(float[] numbers) {
        return getMinimumH(numbers, numbers.length, numbers[0]);
    }
    /**
     * helper method for getMinimum
     * @param numbers
     * @param length
     * @return smallest number in the array
     */
    static float getMinimumH(float[] numbers, int length, float min) {
        if (length <= 0) {
            return min;
        } else {
            if (numbers[length-1] < min) {
                min = numbers[length-1];
            }
            return getMinimumH(numbers, length - 1, min);
        }
    }
    /**
     * finds the largest number in the array using a while-Loop
     * @param numbers
     * @return max number in the array
     */
    static float getMaximum(float[] numbers){
        float max = numbers[0];
        int i = 0;
        while (i < numbers.length){
            if (numbers[i] > max){
                max = numbers[i];
            }
            i++;
        }
        return max;
    }

    /**
     * Calculates the average of the numbers in the array using a for-Loop
     * @param numbers the array of numbers
     * @return the average of the numbers in the array
     */
    static float calculateAverage(float[] numbers){
        float sum = 0;
        for (float num : numbers){
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Checks if the array is sorted in ascending order using a foreach-Loop
     * @param numbers the array of numbers
     * @return true if the array is sorted in ascending order, if in descending order false
     */
    static boolean isSorted(float[] numbers, boolean ascending){
        int j = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            //test for ascending
            if (ascending){
                if (numbers[i] < numbers[i+1]){
                    j++;
                } else {
                    break;
                }
            //test for descending
            } else {
                if (numbers[i] > numbers[i+1]){
                    j++;
                } else {
                    break;
                }
            }
        }
        if (j == numbers.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}
