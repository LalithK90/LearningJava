package ShortHandOperationANDMissilenous;

import java.util.Scanner;

public class ArmstrongNumber {
    /*Armstrong number
     *
     *   153 -->   1       5       3
     *           1*1*1 + 5*5*5 + 3*3*3
     *             1   +  125  +   27
     *           =153
     *   370 -->   3       7       0
     *           3*3*3 + 7*7*7 + 0*0*0
     *             27  +  343  +   0
     *           =370
     * */
    public static void main(String[] args) {
        Example01();
        Example02();
    }

    private static void Example01() {
        int n = 153;
        int temp = n;
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println(temp + " is an armstrong number");
        } else {
            System.out.println(temp + " is not an armstrong number");
        }
    }

    private static void Example02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number value : ");
        int x = scanner.nextInt();
        int temp = x;
        int r, sum = 0;
        while (x > 0) {
            r = x % 10;
            x = x / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("Enter value : " + temp + " is an armstrong number");
        } else {
            System.out.println("Enter value : " + temp + " is not an armstrong number");
        }
    }
}
