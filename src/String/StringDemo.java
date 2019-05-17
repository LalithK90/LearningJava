package String;

import java.util.Scanner;

public class StringDemo {
/*  1   Find out length of both the string
    2   Concatenation of two Strings.
    3   Convert first into UPPERCASE.


    */

    public static void main(String[] args) {
String val1, val2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two string");
        val1 = scanner.nextLine();
        val2 = scanner.nextLine();

        String val3 = val1+val2; // way two
                //val1.concat(val2); way one
        // Length
        int a = val1.length();
        int b  = val2.length();
        System.out.println("String concatenation example work "+val3 +"\n");
        System.out.println("First entered length "+val1+" "+a +" Second entered length "+val2 + " "+val2 );

        // To upper case
        String val4 =val3.toUpperCase();
        System.out.println("Upper case "+ val4);
    }
}
