package ShortHandOperationANDMissilenous;

import java.util.Scanner;

public class PerfectNumber {
    /*Perfect Number
    *
    * 6 --> 1 + 2 + 3 = 6
    * 28 --> 1 + 2 + 4 + 7 + 14 = 28
    * */
    public static void main(String[] args) {
        Example01();
        Example02();
        Example03();
    }

    private static void Example01() {
        int number = 28;
        boolean b = isPerfect(number);
        if (b) {
            System.out.println("Its a perfect number ");
        } else {
            System.out.println("Its not a perfect number");
        }
    }

    private static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
            if (n == sum) {
                return true;
            }
        }
        return false;
    }

    private static void Example02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = scanner.nextInt();
        System.out.println("You entered number is " + number);
        boolean b = isPerfect(number);
        if (b) {
            System.out.println("Its a perfect number ");
        } else {
            System.out.println("Its not a perfect number");
        }
    }

    private static void Example03() {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("You entered number is " + number);
        boolean b = isPerfectOne(number);
        if (b) {
            System.out.println("Its a perfect number ");
        } else {
            System.out.println("Its not a perfect number");
        }
    }

    private static boolean isPerfectOne(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
            if (n == sum) {
                return true;
            }
        }
        return false;
    }


}
