public class Aufgabe3_1 {
    public static void main(String[] args) {
        myTest();
    }

    /*
    method to calculate the power of a number
    @param x the base
    @param n the exponent
    @return the result of x^n
     */
    static double power(final double basis, final int exponent) {
        double result = 1;
        if(exponent<0) {
            int amount=exponent* - 1;
            while( amount > 0) {
                result = result/basis;
                amount -= 1;
            }
            return result;
            }else {
            int Count = exponent;
            while( Count > 0) {
                result = result*basis;
                Count-= 1;
                }
            return result ;
            }
        }
    static void myTest(){
        final boolean b = power(15,5) == 759375;
        if(b) System.out.println("Test passed");
        else System.out.println("Test failed");
    }
}
