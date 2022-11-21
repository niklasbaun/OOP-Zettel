public class Aufgabe5_2 {
    public static void main(String[] args) {

    }

    static void testAll() {

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
        //calculate the distance between the points
        return Math.sqrt(Math.pow(x[x.length] - x[0], 2) + Math.pow(y[y.length] - y[0], 2) + Math.pow(z[z.length] - z[0], 2));
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
        return distance(gps) / (x.length - 1);
    }

    /**
     * calculates the maximum velocity in m/s
     * @param gps
     * @return maxVelocity in m/s
     */
    static double maxVelocity(double[] gps) {

        return 0;
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
