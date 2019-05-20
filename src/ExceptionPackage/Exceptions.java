package ExceptionPackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        finallyBlock();
        tryWithResources();
        tryWithResources1();


    }

    private static void finallyBlock() {
        System.out.println("Finally Block");
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("\n\n\n");
    }

    private static void tryWithResources(){
        System.out.println("try-with-resources");
        FileReader fr = null;
        try {
            File file = new File("file.txt");
            fr = new FileReader(file); char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("\n\n\n");
    }

    private static void tryWithResources1(){
        System.out.println("try-with-resources");
        try(FileReader fr = new FileReader("E://file.txt")) {
            char [] a = new char[50];
            fr.read(a);   // reads the contentto the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");

    }

    /**
     * follow below links to get more details
     *
     * https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
     * */
}
