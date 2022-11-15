public class Aufgabe4_1 {


    public static void main(String[] args) {
        showBillboard("This is Zettel 4 of OOP");
        showBillboard("Testing your own code is important" );
        showBillboard("Testing your program with all kinds of different input values is important!");
    }
    /*

                    \|||||/
                    ( O O )
    |---------ooO-----(_)-----------------|
    |                                     |
    | Testing your own code is important! |
    |                                     |
    |-------------------------Ooo---------|
                    |_| |_|
                     || ||
                    ooO Ooo
    */

    static void showBillboard(String message){
        int num =numOfStringChars(message);
        int row = 0;
        int offSetHair = (numOfStringChars(message)/2)-2;
        int offSetEyes = (numOfStringChars(message)/2)-2;
        int offSetHand1 = (numOfStringChars(message)/2)-9;
        int offSetHand2 = (numOfStringChars(message)/2)+8;
        int offSetLegs1 = (numOfStringChars(message)/2)-2;
        int offSetLegs2 = (numOfStringChars(message)/2)-1;
        int offSetFeet = (numOfStringChars(message)/2)-2;
        while (row < 10) {
            //1st row displaying the hair
            if (row == 0) {
                while ( offSetHair > 0) {
                    System.out.print(" ");
                    offSetHair--;
                }
                System.out.print("\\|||||/");
                row++;
            //second row displaying the eyes
            }else if (row == 1) {
                int i = 0;
                System.out.println("");
                while ( offSetEyes > 0) {
                    System.out.print(" ");
                    offSetEyes--;
                }
                System.out.print("( O O )");
                row++;
            //third row displaying the hands and top of the bord
            } else if (row == 2) {
                System.out.print("\n|");
                int i = 0;
                while ( i < offSetHand1 ) {
                    System.out.print("-");
                    i++;
                }
                System.out.print("ooO-----(_)");
                int j = 0;
                if (num % 2 ==0){
                    while ( j < (num/2)) {
                        System.out.print("-");
                        j++;
                    }
                }else {
                    while ( j < (num/2)+1) {
                        System.out.print("-");
                        j++;
                    }
                }
                System.out.print("|");
                row++;
            //fourth row displaying the bord
            } else if (row == 3) {
                System.out.print("\n|");
                int i = 0;
                while ( i < num+2) {
                    System.out.print(" ");
                    i++;
                }
                System.out.print("|");
                row++;
            //fifth row displaying the message
            } else if (row == 4) {
                System.out.print("\n|");
                System.out.print(" ");
                System.out.print(message);
                System.out.print(" ");
                System.out.print("|");
                row++;
            //sixth row displaying the bord
            } else if (row == 5) {
                System.out.print("\n|");
                int i = 0;
                while (i < num+2) {
                    System.out.print(" ");
                    i++;
                }
                System.out.print("|");
                row++;
            //seventh row displaying the 2nd hand and bottom of the bord
            } else if (row == 6) {
                System.out.print("\n|");
                int i = 0;
                while ( i < offSetHand2-1 ) {
                    System.out.print("-");
                    i++;
                }
                System.out.print("Ooo");
                int j = 0;
                while ( j < num-offSetHand2) {
                    System.out.print("-");
                    j++;
                }
                System.out.println("|");
                row++;
            //eighth row displaying the 1st part of the legs
            } else if (row == 7) {
                while (offSetLegs1 > 0) {
                    System.out.print(" ");
                    offSetLegs1--;
                }
                System.out.println("|_| |_|");
                row++;
            //ninth row displaying the 2nd part of the legs
            } else if (row == 8) {
                while (offSetLegs2 > 0) {
                    System.out.print(" ");
                    offSetLegs2--;
                }
                System.out.println("|| ||");
                row++;
            //tenth row displaying the feet
            } else if (row == 9) {
                while (offSetFeet > 0) {
                    System.out.print(" ");
                    offSetFeet--;
                }
                System.out.println("ooO Ooo");
                row++;
            }

        }
    }

    static int numOfStringChars(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
                count += 1;
        }
        return count;
    }
}
