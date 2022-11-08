public class Aufgabe3_2 {
    public static void main(String[] args) {
        System.out.println(postage(1, 2, 3, 4));
    }

    static int postage(int length, int width, int height, int weight) {
        //Postkarte
        if ((isBetween(length, 140, 235))&&(isBetween(width, 90, 125))&&(height<=2)&&(weight<=15)) {
            return 70;
        } //Standard
        else if ((isBetween(length, 140, 235))&&(isBetween(width, 90, 125))&&(height<=5)&&(weight<=20)) {
            return 85;
        } //Kompakt
        else if ((isBetween(length, 100, 235))&&(isBetween(width, 70, 125))&&(height<=10)&&(weight<=50)) {
            return 100;
        } //Groß
        else if ((isBetween(length, 100, 353))&&(isBetween(width, 70, 250))&&(height<=20)&&(weight<=500)) {
            return 160;
        } //Maxi
        else if ((isBetween(length, 100, 353))&&(isBetween(width, 70, 250))&&(height<=50)&&(weight<=1000)) {
            return 275;
        } else {
            return -1;
        }
    }

    static boolean isBetween(int value, int lower, int upper) {
        if (value >= lower && value <= upper) {
            return true;
        } else {
            return false;
        }
    }
}

