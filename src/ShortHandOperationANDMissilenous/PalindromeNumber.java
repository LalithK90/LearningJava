package ShortHandOperationANDMissilenous;

import java.util.Scanner;

public class PalindromeNumber {
    /**
     * Palindrome Number
     * <p>
     * Basically input numbers and output numbers are same
     */
    public static void main(String[] args) {
        Example01();
        Example02();
    }

    private static void Example01() {
        int n = 119, r, s = 0;
        int t = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        System.out.println(t + "\n" + s);
        if (t == s) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
        private static void Example02(){
            int x, r, s = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number ");
            x = scanner.nextInt();
            int t = x;
            while (x > 0) {
                r = x % 10;
                x = x / 10;
                s = s * 10 + r;
            }
            System.out.println(" Input Number : "+t + "\n Output Number : " + s);
            if (t == s) {
                System.out.println("Number is palindrome, \n Enter Number is : "+t);
            } else {
                System.out.println("Number is not a palindrome,  Enter Number is : " +t);
            }
        }

}
