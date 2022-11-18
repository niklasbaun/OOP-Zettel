public class Aufgabe4_3 {
    public static void main(String[] args) {

    }

    static double krt(double a, double k, double d) {
        if (a <= 0){
            return 0;
        }else {
            return krtH(a, k, d, 1);
        }
    }

    static double krtH(double a, double k, double d, double x_n) {
        if (x_n == 0) {
            return a;
        } else {
            return (1/k)*((k-1)+x_n+(1/krtH(a, k, d, x_n+1)));
        }
    }

}
