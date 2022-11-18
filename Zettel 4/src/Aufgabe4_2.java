public class Aufgabe4_2 {
    public static void main(String[] args) {
        System.out.println(toTwosComplement(-3));
        System.out.println(toTwosComplement(3));
        System.out.println(toTwosComplement(8));
        System.out.println(toTwosComplement(-8));
    }

    /**
     * converts a given decimal number to a binary number
     *
     * @param n
     * @return binary
     */
    static String toBinary(int n) {
        String binary = "";
        if (n < 0) {
            return "Error";
        } else {
            while (n > 0) {
                binary = n % 2 + binary;
                n = n / 2;
            }
            return binary;
        }
    }

    /**
     * converts a given decimal number to a octal number
     *
     * @param n
     * @return octal
     */
    private static String toOctal(int n) {
        String octal = "";
        if (n < 0) {
            return "Error";
        } else {
            while (n > 0) {
                octal = n % 8 + octal;
                n = n / 8;
            }
            return octal;
        }
    }

    /**
     * gives the twos complement of a given decimal number
     *
     * @param n
     * @return
     */
    static String toTwosComplement(int n) {
        //vars used in the method
        String binary = "";
        String twosComplement = "";
        int i;
        String onesComplement = "";
        //check if number is in given value range
        if (n < -128 || n > 127) {
            System.out.println("Number is not in the given value range");
            return null;
        } else {
            //check if number is negative
            if (n < 0) {
                //convert to binary
                binary = toBinary(n);
                //check if number is 8 bit long
                if (binary.length() < 8) {
                    //add leading zeros
                    for (i = 0; i < 8 - binary.length(); i++) {
                        binary = "0" + binary;
                    }
                }
                //invert the bits
                for (i = 0; i < binary.length(); i++) {
                    if (binary.charAt(i) == '0') {
                        onesComplement = onesComplement + "1";
                    } else {
                        onesComplement = onesComplement + "0";
                    }
                }
                //add 1 to the inverted bits, to create twos complement out of ones complement
                twosComplement = onesComplement;
                for (i = n - 1; i >= 0; i--) {
                    if (onesComplement.charAt(i) == '1') {
                        twosComplement = twosComplement.substring(0, i) + '0' + twosComplement.substring(i + 1);
                    } else {
                        twosComplement = twosComplement.substring(0, i) + '1' + twosComplement.substring(i + 1);
                        break;
                    }
                }

                //return the twos complement
                return twosComplement;

            } else {
                //if number is positive, convert to binary
                binary = toBinary(n);
                //check if number is 8 bit long
                if (binary.length() < 8) {
                    //add leading zeros
                    for (i = 0; i < 8 - binary.length(); i++) {
                        binary = "0" + binary;
                    }
                }
                //binary is the same as ones complement
                onesComplement = binary;
                //add 1 to the inverted bits, to create twos complement out of ones complement
                twosComplement = onesComplement;
                for (i = n - 1; i >= 0; i--) {
                    if (onesComplement.charAt(i) == '1') {
                        twosComplement = twosComplement.substring(0, i) + '0' + twosComplement.substring(i + 1);
                    } else {
                        twosComplement = twosComplement.substring(0, i) + '1' + twosComplement.substring(i + 1);
                        break;
                    }
                }
                //return the twos complement
                return twosComplement;
            }
        }
    }


    static void testToBinary() {
        String binaryTest1 = "0";
        String binaryTest1Result = toBinary(0);
        if (binaryTest1.equals(binaryTest1Result)) {
            System.out.println("Binary test 1 passed");
        } else {
            System.out.println("Binary test 1 failed");
            System.out.println("Expected: " + binaryTest1);
            System.out.println("Actual: " + binaryTest1Result);
        }

        String binaryTest2 = "Error";
        String binaryTest2Result = toBinary(-1);
        if (binaryTest2.equals(binaryTest2Result)) {
            System.out.println("Binary test 2 passed");
        } else {
            System.out.println("Binary test 2 failed");
            System.out.println("Expected: " + binaryTest2);
            System.out.println("Actual: " + binaryTest2Result);
        }

        String binaryTest3 = "1111";
        String binaryTest3Result = toBinary(15);
        if (binaryTest3.equals(binaryTest3Result)) {
            System.out.println("Binary test 3 passed");
        } else {
            System.out.println("Binary test 3 failed");
            System.out.println("Expected: " + binaryTest3);
            System.out.println("Actual: " + binaryTest3Result);
        }
    }

    static void testToOctal(){
        String octalTest1 = "0";
        String octalTest1Result = toOctal(0);
        if (octalTest1.equals(octalTest1Result)) {
            System.out.println("Octal test 1 passed");
        } else {
            System.out.println("Octal test 1 failed");
            System.out.println("Expected: " + octalTest1);
            System.out.println("Actual: " + octalTest1Result);
        }

        String octalTest2 = "Error";
        String octalTest2Result = toOctal(-1);
        if (octalTest2.equals(octalTest2Result)) {
            System.out.println("Octal test 2 passed");
        } else {
            System.out.println("Octal test 2 failed");
            System.out.println("Expected: " + octalTest2);
            System.out.println("Actual: " + octalTest2Result);
        }

        String octalTest3 = "17";
        String octalTest3Result = toOctal(15);
        if (octalTest3.equals(octalTest3Result)) {
            System.out.println("Octal test 3 passed");
        } else {
            System.out.println("Octal test 3 failed");
            System.out.println("Expected: " + octalTest3);
            System.out.println("Actual: " + octalTest3Result);
        }
    }

    static void testToTwosComplement(){

    }
}
