package Operators.Statments.Loop;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Example02();
        Example01();
    }

    private static void Example01() {
        int[] a = new int[7];
        int j = 1;
        System.out.println("\n Make array using for loop");
        for (int i = 0; i < a.length; i++) {
            a[i] = j;
            j += 1;
        }
        System.out.println("All variable in Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array Index : " + i + " value : " + a[i]);
        }
    }

    private static void Example02() {
        int[] b = new int[10];
        System.out.println("\n Make array using for loop with random number");
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println("All variable in Array : ");
        for (int example : b) {
            System.out.println("Array  value : " + example);
        }
    }

}
