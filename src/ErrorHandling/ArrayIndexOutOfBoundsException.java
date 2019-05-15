package ErrorHandling;

import java.util.Random;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Example01(); // Error resolve --> Noramly after this method work
        Example02(); //Error make --> not work any method after this
    }
    private static void Example01() {
        int[] a = new int[10];
        Random random = new Random();

        System.out.println("\n Make array using for loop with random number");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        try {
            System.out.println(a[52]);
        }catch (Exception e){
            System.out.println("Maximum Arraya is filled " + e.toString());
        }


        System.out.println("All variable in Array : ");
        for (int example : a) {
            System.out.println("Array  value : " + example);
        }
    }

    private static void Example02() {
        int[] a = new int[50];
        Random random = new Random();

        System.out.println("\n Make array using for loop with random number");
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        System.out.println(a[52]);

        System.out.println("All variable in Array : ");
        for (int example : a) {
            System.out.println("Array  value : " + example);
        }
    }
}
