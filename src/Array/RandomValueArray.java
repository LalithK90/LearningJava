package Array;

import java.util.Random;

public class RandomValueArray {
    public static void main(String[] args) {
        Example01();
        Example02();
    }

    private static void Example01() {
        int[] c = new int[10];
        int k = 1;
        System.out.println("\n Make array using for loop");
        for (int i = 0; i < c.length; i++) {
            c[i] = k;
            k += 1;
        }
        System.out.println("All variable in Array : ");
        for (int i = 0; i < c.length; i++) {
            System.out.println("Array Index : " + i + " value : " + c[i]);
        }
    }

    private static void Example02() {
        int[] e = new int[10];

        Random random = new Random();

        System.out.println("\n Make array using for loop with random number");
        for (int i = 0; i < e.length; i++) {
            e[i] = random.nextInt(50);
        }
        System.out.println("All variable in Array : ");
        for (int example : e) {
            System.out.println("Array  value : " + example);
        }
    }
}
