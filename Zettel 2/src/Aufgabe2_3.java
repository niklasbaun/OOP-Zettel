public class Aufgabe2_3 {
    public static void main(String[] args){
        //Testfall1, mehr Geld als möglich
        System.out.println("----------------------");
        System.out.println("Testfall 1");
        wechselGeld(6.25);
        System.out.println("Error zuviel Geld wird erwartet");
        System.out.println("----------------------");

        //Testfall2, weniger Geld als notwendig
        System.out.println("Testfall 2");
        wechselGeld(0.40);
        System.out.println("----------------------");

        //Testfall3, negative Zahl
        System.out.println("Testfall 3");
        wechselGeld(-3);
        System.out.println("----------------------");

        //Testfall4, 3€
        System.out.println("Testfall 4");
        wechselGeld(3);
        System.out.println("----------------------");

        //Testfall5, 2.56€
        System.out.println("Testfall 5");
        wechselGeld(2.56);
        System.out.println("----------------------");
    }

    static void wechselGeld(double geld){
        int[] Münzen = new int[8];
        int anzahlZweiEuro = 0;
        int anzahlEinEuro = 0;
        int anzahlFünfzigCent = 0;
        int anzahlZwanzigCent = 0;
        int anzahlZehnCent = 0;
        int anzahlFünfCent = 0;
        int anzahlZweiCent = 0;
        int anzahlEinCent = 0;
        if (geld > 5) {
            System.out.println("Error, zu viel Geld");
        } else if (geld < 0.72) {
            System.out.println("Error, zu wenig Geld");
        } else {
            float restGeld;
            restGeld = (float) (geld - 0.72);
            restGeld = restGeld * 100;
            if (restGeld >= 200) {
                anzahlZweiEuro = (int) (restGeld / 200);
                restGeld = restGeld %= 200;
            } if (restGeld >= 1) {
                anzahlEinEuro = (int) (restGeld / 100);
                restGeld = restGeld %= 100;
            } if (restGeld >= 50) {
                anzahlFünfzigCent = (int) (restGeld / 50);
                restGeld = restGeld %= 50;
            } if (restGeld >= 20) {
                anzahlZwanzigCent = (int) (restGeld / 20);
                restGeld = restGeld %= 20;
            } if (restGeld >= 10) {
                anzahlZehnCent = (int) (restGeld / 10);
                restGeld = restGeld %= 10;
            } if (restGeld >= 5) {
                anzahlFünfCent = (int) (restGeld / 5);
                restGeld = restGeld %= 5;
            } if (restGeld >= 2) {
                anzahlZweiCent = (int) (restGeld / 2);
                restGeld = restGeld %= 2;
            } if (restGeld >= 1) {
                anzahlEinCent = (int) restGeld / 1;
            }
            System.out.println("Gesamtes Restgeld: " + restGeld);
            System.out.println(anzahlZweiEuro + " X 2 Euro");
            System.out.println(anzahlEinEuro + " X 1 Euro");
            System.out.println(anzahlFünfzigCent + " X 50ct");
            System.out.println(anzahlZwanzigCent + " X 20ct");
            System.out.println(anzahlZehnCent + " X 10ct");
            System.out.println(anzahlFünfCent + " X 5ct");
            System.out.println(anzahlZweiCent + " X 2ct");
            System.out.println(anzahlEinCent + " X 1ct");
        }




    }

}
