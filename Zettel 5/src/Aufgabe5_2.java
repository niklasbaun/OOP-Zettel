public class Aufgabe5_2 {
    public static void main(String[] args) {
        testAll();
    }

    static void testAll() {
        double testArrayGPS[] = {-20.0, 0.0,200.0, -18.5, -0.647,200.577, -16.85, -1.237,
                201.16, -15.035, -1.763, 201.739, -13.038, -2.219,
                202.299, -10.842, -2.599, 202.824, -8.426, -2.894,
                203.289, -5.769, -3.096, 203.667, -2.846, -3.195, 203.918,
                0.369, -3.182, 203.998, 3.861, -3.205, 203.85, 7.284,
                -3.176, 203.469, 10.638, -3.209, 202.868, 13.926, -3.175,
                202.06, 17.147, -3.209,201.059, 20, -3.174, 199.877};
        //test for distance
        double testdistance = 0.0;

    }

    /**
     * calculates the total distance run
     * @param gps
     * @return distance
     */
    static double distance(double[] gps){
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        //calculate the distance between the  each of the points
        double distance = 0;
        for (int i = 0; i < x.length - 1; i++) {
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
        //split the array into three arrays for x, y and z coordinates using the helper methods
        double[] x = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] y = getEveryThirdElement(gps);
        gps = removeFirstElement(gps);
        double[] z = getEveryThirdElement(gps);
        //calculate the velocity between the points
        //is length of the array - 1 because the first element is the start point
        int time = x.length-1;
        return distance(gps) / (time);
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
        //calcualte the velocities between the points
        for (int i = 0; i < velocities.length; i++) {
            velocities[i] = Math.sqrt(Math.pow(x[i + 1] - x[i], 2) + Math.pow(y[i + 1] - y[i], 2) + Math.pow(z[i + 1] - z[i], 2));
        }
        //find the maximum velocity
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
        for (i = 0, i < x.length, i++) {
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
        for (i = startPoint; i < endPoint; i++) {
            int j = 0;
            partialGPS[j] = x[i];
            partialGPS[j + 1] = y[i];
            partialGPS[j + 2] = z[i];
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
        double[] everyThirdElement = new double[arr.length / 3];
        int j = 0;
        for (int i = 2; i < arr.length; i += 3) {
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
