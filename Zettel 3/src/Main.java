public class Main {
    public static void main(String[] args) {
        //towersOfHanoi(3, 'A', 'B', 'C');
        System.out.println(harmonicsRecursive(72));
    }
    //method to solve towers of hanoi
    static void towersOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towersOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towersOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    //determine the power of a number recursively
    static double power(double x, int n) {
        if(n == 0) {
            return 1;
        } else {
            //n muss reduziert werden
            return x * power(x, n - 1);
        }
    }

    static double geometrics(int n, double x) {
        double result = 0;
        while (n > 0) {
            result += power(x, n);
                n -= 1;
            }
        return result;
    }

    static double geometricsRecursive(int n, double x) {
        if(n ==0){
            return 1;
        } else {
            return power(x, n) + geometricsRecursive(n - 1, x);
        }
    }

    static double harmonicsRecursive(int n){
        if(n == 1){
            return 1;
        } else {
            return harmonicsRecursive(n - 1) + (1.0 / n);
        }
    }
}