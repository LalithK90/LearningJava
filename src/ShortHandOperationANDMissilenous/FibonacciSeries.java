package ShortHandOperationANDMissilenous;


        import sun.rmi.runtime.NewThreadAction;

        import java.util.Date;
        import java.util.Scanner;

public class FibonacciSeries {
    /*Expected out put

    1 1 2 3 5 8 13 ...............
     */
    public static void main(String[] args) {
        Example01();
        Example02();
    }

    private static void Example01() {
        System.out.println(new Date());
        int i, j = 1, k = 1;
        i = 0;
        System.out.print("1 1 ");
        while (i <= 1000000000) {
            i = j + k;
            System.out.print(i + " ");
            j = k;
            k = i;
            // j=k=i; wrong output will provide
        }
        System.out.println("\n" + new Date());
    }
    private static void Example02() {
        System.out.println(new Date());
        int i, j = 1, k = 1;
        i = 0;
        System.out.println("Please Any Number : ");
        Scanner scanner = new Scanner(System.in);
        int interValue = scanner.nextInt();
        System.out.print("1 1 ");
        while (i <= interValue) {
            i = j + k;
            System.out.print(i + " ");
            j = k;
            k = i;
            // j=k=i; wrong output will provide
        }
        System.out.println("\n" + new Date());
    }


}
