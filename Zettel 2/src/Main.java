public class Main {
    public static void main(String[] args) {
        System.out.println("This is Zettel 2 of OOP");
        method1();
    }
    static void method1(){
        System.out.println("Enter Method 1");
        method2_1();
        method2_2();
        System.out.println("Exit Method 1");
    }

    static void method2_1() {
        System.out.println("Enter Method 2_1");
        method2_2();
        System.out.println("Exit Method 2_1");
    }

    static void method2_2() {
        System.out.println("Enter Method 2_2");
        method3();
        System.out.println("Exit Method 2_2");
    }

   static void method3() {
       System.out.println("Enter Method 3");
       System.out.println("Exit Method 3");
    }


}