public class Aufgabe3_1 {
    public static void main(String[] args) {
        mein_test();
    }

    static double meine_berechnung(final double basis, final int exponent) {
        double result = 1;
        if(exponent<0) {
            int anzahl=exponent* -1;
            while( anzahl > 0) {
                result = result/basis;
                anzahl -= 1;
                }
            return result;
            }else {
            int Count = exponent;
            while( Count > 0) {
                result = result*basis;
                Count-=1;
                }
            return result ;
            }
        }
    static void mein_test(){
        final boolean b = meine_berechnung(15,5) == 759375;
        if(b) System.out.println("Test passed");
        else System.out.println("Test failed");
    }
}
