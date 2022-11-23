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

        //test for distance
        double testdistance = 0.0;
        System.out.println(distance(testArrayGPS) + "m");
        System.out.println(velocity(testArrayGPS) + "m/s");
        System.out.println(maxVelocity(testArrayGPS) + "m/s");

    }

    /**
     * calculates the total distance run
     * @param gps
     * @return distance
     */
    static double distance(double[] gps){
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        System.out.println(Arrays.toString(x));
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        System.out.println(Arrays.toString(y));
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        System.out.println(Arrays.toString(z));
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
     * @param gps
     * @return velocity in m/s
     */
    static double velocity(double[] gps){
        //calculate the velocity between the points
        //is length of the array - 1 because the first element is the start point
        int time = gps.length / 3 - 1;
        return distance(gps) / time;
    }

    /**
     * calculates the maximum velocity in m/s
     * @param gps
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
        for (int i = 1; i < velocities.length; i++) {
            if (velocities[i] > maxVelocity) {
                maxVelocity = velocities[i];
            }
        }
        return maxVelocity;
    }

    /**
     * method which finds coordinates between two given coordinates
     * @param gps
     * @param start
     * @param end
     * @return array with coordinates between start and end
     */
    static double[] partialGPS(double[] gps, double[] start, double[] end) {
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        //find the start and end point
        int startPoint = 0;
        int endPoint = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == start[0] && y[i] == start[1] && z[i] == start[2]) {
                startPoint = i;
            }
            if (x[i] == end[0] && y[i] == end[1] && z[i] == end[2]) {
                endPoint = i;
            }
        }
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

    /**
     * Helper method to return the every third element of an array
     * @param arr
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
     * @param arr
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
