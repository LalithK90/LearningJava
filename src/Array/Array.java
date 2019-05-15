package Array;

public class Array {
    public static void main(String[] args) {
        Example01();
        Example02();
        Example03();
        Example04();
        Example05();

    }

    private static void Example01() {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println("One variable in Array : " + a[4] + "\n");
    }

    private static void Example02() {
        int[] a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        System.out.println("All variable in Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array Index : " + i + " value : " + a[i]);
        }
    }

    private static void Example03() {
        int[] a = new int[6];
        int j = 1;
        System.out.println("\n Make array using for loop");
        for (int i = 0; i <= 5; i++) {
            a[i] = j;
            j += 1;
        }
        System.out.println("All variable in Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array Index : " + i + " value : " + a[i]);
        }
    }

    private static void Example04() {
        int[] b = new int[7];
        int j = 1;
        System.out.println("\n Make array using for loop");
        for (int i = 0; i <= 6; i++) {
            b[i] = j;
            j += 1;
        }
        System.out.println("All variable in Array : ");
        for (int example : b) {
            System.out.println("Array  value : " + example);
        }
    }

    private static void Example05() {
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
