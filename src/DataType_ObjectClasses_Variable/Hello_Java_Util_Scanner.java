package DataType_ObjectClasses_Variable;

import java.util.*;

/**
 * Packages are a part of a class name and they are used to group and/or distinguish named entities from other ones.
 * Another purpose of packages is to govern code access together with access modifiers.
 * For example,
 * java.io.InputStream is a fully qualified class name for the class InputStream which is located in the package java.io.

        A package is declared at the start of the file with the package declaration:*/


public class Hello_Java_Util_Scanner {
    public static void main(String[] args) {

        Scanner userInputScanner = new Scanner(System.in);
        //Scanner method use to take input from user
        System.out.print("What is your name ? ");
        //take value what was user typed and it was converted to string
        String userInputName = userInputScanner.nextLine();
        //converted input display in the console
        System.out.println("Hello_Java_Util_Scanner "+ userInputName +" !");
    }

}
