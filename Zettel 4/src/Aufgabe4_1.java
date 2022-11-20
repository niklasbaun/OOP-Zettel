public class Aufgabe4_1 {

    /**
     * @param args the command line arguments
     * @param args
     * main method calls showBillboard with different messages to test the method
     */
    public static void main(String[] args) {
        //tests for showBillboard
        //test 1
        showBillboard("This is Zettel 4 of OOP");
        //test 2
        showBillboard("Testing your own code is important" );
        //test 3
        showBillboard("Testing your program with all kinds of different input values is important!");
        //test 4 Message longer then 84 characters
        showBillboard("This is a Message with more than 84 characters, to show that the method will display an Error Message");
        //test 5 Message empty
        showBillboard("");
    }

    /**
     * showBillboard method displays a message in a billboard style with Klaus holding the sign
     * @param message
     * if the message is longer than 84 characters, the Billboard will display an error message
     */
    static void showBillboard(String message){
        int num =numOfStringChars(message);
        int msgLength = 0;
        String display = "";
        if (19 < num && num < 84){
            display = message;
            msgLength = numOfStringChars(message);
        //if message is shorter than the minimum width of the board held by Klaus it will be set to the minimum width
        } else if (num < 19){
            num = 17;
            msgLength = numOfStringChars(message);
        } else if (num == 0) {
            num = 17;
            msgLength = 2;
        } else{
            display = "Error: Message was too long";
            num = 27;
            msgLength = 27;
        }

        int row = 0;
        int offSetHair = (num/2)-1;
        int offSetEyes = (num/2)-1;
        int offSetHand1 = (num/2)-8;
        int offSetHand2 = (num/2)+9;
        int offSetLegs1 = (num/2)-1;
        int offSetLegs2 = (num/2);
        int offSetFeet = (num/2)-1;
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
                while ( i < offSetHand1) {
                    System.out.print("-");
                    i++;
                }
                System.out.print("ooO-----(_)");
                int j = 0;
                if (num % 2 ==0){
                    while ( j < (num/2)-1) {
                        System.out.print("-");
                        j++;
                    }
                }else {
                    while ( j < (num/2)) {
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
                while (i < num+2) {
                    System.out.print(" ");
                    i++;
                }
                System.out.print("|");
                row++;
            //fifth row displaying the message
            } else if (row == 4) {
                System.out.print("\n|");
                int i = msgLength/2;
                while ( i < (num/2)+1) {
                    System.out.print(" ");
                    i++;
                }
                System.out.print(display);
                int j = msgLength/2;
                if (msgLength == 0){
                    while ( j < (num/2)+2) {
                        System.out.print(" ");
                        j++;
                    }
                }else {
                    while ( j < (num/2)+1) {
                        System.out.print(" ");
                        j++;
                    }
                }
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

    /**
     * @param message
     * @return integer
     * numOfStringChars helpermethod which returns the number of characters in a string
     */
    static int numOfStringChars(String message){
        int count = 0;
        for(int i = 0; i < message.length(); i++) {
                count += 1;
        }
        return count;
    }
}
