import java.util.Arrays;

public class Aufgabe5_2 {
    public static void main(String[] args) {
        testAllGPS();
    }

    static void testAllGPS() {
        double testArrayGPS[] = {-20.0, 0.0,200.0, -18.5, -0.647,200.577, -16.85, -1.237,
                201.16, -15.035, -1.763, 201.739, -13.038, -2.219,
                202.299, -10.842, -2.599, 202.824, -8.426, -2.894,
                203.289, -5.769, -3.096, 203.667, -2.846, -3.195, 203.918,
                0.369, -3.182, 203.998, 3.861, -3.205, 203.85, 7.284,
                -3.176, 203.469, 10.638, -3.209, 202.868, 13.926, -3.175,
                202.06, 17.147, -3.209,201.059, 20, -3.174, 199.877};
        double testArrayGPS1[] = {0.0, 0.0, 0.0, 4.3, 5.2, 6.7};
        double testArrayGPS2[] = {0.0, 0.0, 0.0, -6.8, -7.5, -8.2};

        //1st test for distance
        System.out.println("Tests for distance");
        double testdistance1 = 41.48414;
        double roundedDistance = (double) Math.round(distance(testArrayGPS) * 100000d) / 100000d;
        if (testdistance1 == roundedDistance) {
            System.out.println("Test for distance passed");
        } else {
            System.out.println("Test for distance failed");
            System.out.println("Expected Value " + testdistance1);
            System.out.println("Actual Value " + distance(testArrayGPS));
        }
        //2nd test for distance
        double testdistance2 = 9.50894;
        double roundedDistance2 = (double) Math.round(distance(testArrayGPS1) * 100000d) / 100000d;
        if (testdistance2 == roundedDistance2) {
            System.out.println("Test for distance passed");
        } else {
            System.out.println("Test for distance failed");
            System.out.println("Expected Value " + testdistance2);
            System.out.println("Actual Value " + roundedDistance2);
        }

        //3rd test for distance
        double testdistance3 = 13.02805;
        double roundedDistance3 = (double) Math.round(distance(testArrayGPS2) * 100000d) / 100000d;
        if (testdistance3 == roundedDistance3) {
            System.out.println("Test for distance passed");
        } else {
            System.out.println("Test for distance failed");
            System.out.println("Expected Value " + testdistance3);
            System.out.println("Actual Value " + roundedDistance3);
        }

        System.out.println("----------------------------------");
        System.out.println("Tests for average Velocity");
        //1st test for averageVelocity
        double testAverageVelocity = 2.7656;
        double roundedAverageVelocity = (double) Math.round(velocity(testArrayGPS) * 10000d) / 10000d;
        if (testAverageVelocity == roundedAverageVelocity) {
            System.out.println("Test for averageSpeed passed");
        } else {
            System.out.println("Test for averageSpeed failed");
            System.out.println("Expected Value " + testAverageVelocity);
            System.out.println("Actual Value " + roundedAverageVelocity);
        }

        //2nd test for averageVelocity
        double testAverageVelocity2 = 9.5089;
        double roundedAverageVelocity2 = (double) Math.round(velocity(testArrayGPS1) * 10000d) / 10000d;
        if (testAverageVelocity2 == roundedAverageVelocity2) {
            System.out.println("Test for averageSpeed passed");
        } else {
            System.out.println("Test for averageSpeed failed");
            System.out.println("Expected Value " + testAverageVelocity2);
            System.out.println("Actual Value " + roundedAverageVelocity2);
        }

        //3rd test for averageVelocity
        double testAverageVelocity3 = 13.028;
        double roundedAverageVelocity3 = (double) Math.round(velocity(testArrayGPS2) * 10000d) / 10000d;
        if (testAverageVelocity3 == roundedAverageVelocity3) {
            System.out.println("Test for averageSpeed passed");
        } else {
            System.out.println("Test for averageSpeed failed");
            System.out.println("Expected Value " + testAverageVelocity3);
            System.out.println("Actual Value " + roundedAverageVelocity3);
        }

        System.out.println("----------------------------------");
        System.out.println("Tests for maxVelocity");
        //1st test for maxVelocity
        double testmaxVelocity = 3.495;
        double roundedMaxVelocity = (double) Math.round(maxVelocity(testArrayGPS) * 1000d) / 1000d;
        if (testmaxVelocity == roundedMaxVelocity) {
            System.out.println("Test for maxVelocity passed");
        } else {
            System.out.println("Test for maxVelocity failed");
            System.out.println("Expected Value " + testmaxVelocity);
            System.out.println("Actual Value " + roundedMaxVelocity);
        }

        //2nd test for maxVelocity
        double testmaxVelocity2 = 9.5089;
        double roundedMaxVelocity2 = (double) Math.round(maxVelocity(testArrayGPS1) * 10000d) / 10000d;
        if (testmaxVelocity2 == roundedMaxVelocity2) {
            System.out.println("Test for maxVelocity passed");
        } else {
            System.out.println("Test for maxVelocity failed");
            System.out.println("Expected Value " + testmaxVelocity2);
            System.out.println("Actual Value " + roundedMaxVelocity2);
        }

        //3rd test for maxVelocity
        double testmaxVelocity3 = 13.028;
        double roundedMaxVelocity3 = (double) Math.round(maxVelocity(testArrayGPS2) * 10000d) / 10000d;
        if (testmaxVelocity3 == roundedMaxVelocity3) {
            System.out.println("Test for maxVelocity passed");
        } else {
            System.out.println("Test for maxVelocity failed");
            System.out.println("Expected Value " + testmaxVelocity3);
            System.out.println("Actual Value " + roundedMaxVelocity3);
        }

        System.out.println("----------------------------------");
        System.out.println("Tests for partialGPS");
        //1st test for partialGPS
        double[] testPartial = testArrayGPS;
        double[] start = {0.0, 0.0, 0.0};
        double[] end = {20.0, 3.174, 199.877};
        double[] partialGPS = partialGPS(testArrayGPS, start, end);
        boolean result = false;
        for (int i = 0; i < testPartial.length; i++) {
            if (testPartial[i] == partialGPS[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Test for partialGPS passed");
        } else {
            System.out.println("Test for partialGPS failed");
            System.out.println("Expected Value " + Arrays.toString(testPartial));
            System.out.println("Actual Value " + Arrays.toString(partialGPS));
        }

        //2nd test for partialGPS
        double[] testPartial1 = testArrayGPS1;
        double[] start1 = {-16.85, -1.237, 201.16};
        double[] end1 = {10.638, -3.209, 202.868};
        double[] partialGPS1 = partialGPS(testArrayGPS1, start1, end1);
        boolean result1 = false;
        for (int i = 0; i < testPartial1.length; i++) {
            if (testPartial1[i] == partialGPS1[i]) {
                result1 = true;
            } else {
                result1 = false;
                break;
            }
        }
        if (result1) {
            System.out.println("Test for partialGPS passed");
        } else {
            System.out.println("Test for partialGPS failed");
            System.out.println("Expected Value " + Arrays.toString(testPartial1));
            System.out.println("Actual Value " + Arrays.toString(partialGPS1));
        }

        //3rd test for partialGPS
        double[] testPartial2 = testArrayGPS2;
        double[] start2 = {4.3, 5.2, 6.7};
        double[] end2 = {0.0, 0.0, 0.0};
        double[] partialGPS2 = partialGPS(testArrayGPS2, start2, end2);
        boolean result2 = false;
        for (int i = 0; i < testPartial2.length; i++) {
            if (testPartial2[i] == partialGPS2[i]) {
                result2 = true;
            } else {
                result2 = false;
                break;
            }
        }
        if (result2) {
            System.out.println("Test for partialGPS passed");
        } else {
            System.out.println("Test for partialGPS failed");
            System.out.println("Expected Value " + Arrays.toString(testPartial2));
            System.out.println("Actual Value " + Arrays.toString(partialGPS2));
        }

    }

    /**
     * calculates the total distance run
     * @param gps array with the gps coordinates
     * @return distance the runner moved in meters
     */
    static double distance(double[] gps){
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        //calculate the distance between each of the points
        double distance = 0;
        //length of the array -2, because the array starts at 0, and we need to stop at the second last element
        for (int i = 0; i < x.length - 2; i++) {
            distance += Math.sqrt(Math.pow(x[i + 1] - x[i], 2) + Math.pow(y[i + 1] - y[i], 2) + Math.pow(z[i + 1] - z[i], 2));
        }
        return distance;
    }

    /**
     * calculates the average velocity in m/s
     * @param gps array with the gps coordinates
     * @return velocity the average velocity in m/s
     */
    static double velocity(double[] gps){
        //calculate the velocity between the points
        //is length of the array - 1 because the first element is the start point
        int time = gps.length / 3 - 1;
        return distance(gps) / time;
    }

    /**
     * calculates the maximum velocity in m/s
     * @param gps array with the gps coordinates
     * @return maxVelocity in m/s
     */
    static double maxVelocity(double[] gps) {
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        //calculate the velocities between the single points
        double[] velocities = new double[x.length - 1];
        //calculate the velocities between the points
        for (int i = 0; i < velocities.length-1; i++) {
            //velocity is equal to the distance between the points, because the time passed is 1 second
            velocities[i] = Math.sqrt(Math.pow(x[i + 1] - x[i], 2) + Math.pow(y[i + 1] - y[i], 2) + Math.pow(z[i + 1] - z[i], 2));
        }
        //find the maximum velocity (value) in the array
        double maxVelocity = 0;
        for (int i = 0; i < velocities.length; i++) {
            if (velocities[i] > maxVelocity) {
                maxVelocity = velocities[i];
            }
        }
        return maxVelocity;
    }

    /**
     * method which finds coordinates between two given coordinates
     * @param gps the array with the gps coordinates
     * @param start the start coordinates
     * @param end the end coordinates
     * @return array with coordinates between start and end
     */
    static double[] partialGPS(double[] gps, double[] start, double[] end) {
        double[] temp = gps;
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        //find the start and end point
        int startPoint = -1;
        int endPoint = -1;
        for (int i = 0; i < x.length-1; i++) {
            if (x[i] == start[0] && y[i] == start[1] && z[i] == start[2]) {
                startPoint = i;
            }
            if (x[i] == end[0] && y[i] == end[1] && z[i] == end[2]) {
                endPoint = i;
            }
        }
        if (endPoint > startPoint || endPoint == -1 || startPoint == -1) {
            return temp;
        } else {
            //create a new array with the coordinates between start and end
            double[] partialGPS = new double[(endPoint - startPoint) * 3];
            //fill the array with the coordinates
            for (int s = startPoint;  s < endPoint; s++ ) {
                int j = 0;
                partialGPS[j] = x[s];
                partialGPS[j + 1] = y[s];
                partialGPS[j + 2] = z[s];
                j += 3;
            }
            return partialGPS;
        }
    }

    /**
     * Helper method to return the every third element of an array
     * @param arr an array
     * @return array with every third element
     */
    static double[] getEveryThirdElement(double[] arr) {
        double[] everyThirdElement = new double[arr.length / 3 + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i += 3) {
            everyThirdElement[j] = arr[i];
            j++;
        }
        return everyThirdElement;
    }

    /**
     * Helper method to remove the 1st element of an array
     * @param arr an array
     * @return array without the 1st element
     */
    static double[] removeFirstElement(double[] arr) {
        double newArr[] = new double[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }
}
