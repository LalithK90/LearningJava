package ShortHandOperationANDMissilenous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class InputUsingSystem_in_readMethod {
    /*    Scanner
          BufferredReader


        */
    public static void main(String[] args) throws IOException {
        //advance read() is mentioned above;

/*        int i = System.in.read();  //given input convert to ASCII value
        System.out.println(i);
        System.out.println((char) i);*/

/*        System.out.println("\n BufferedReader\n");
        String string = "";
        //what where how
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        string = bufferedReader.readLine();

        System.out.println("Hello "+ string+"\n");*/

/*
        System.out.println("\n BufferedReader\n");
        String string = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        string = bufferedReader.readLine();
        int example = parseInt(string); // easy to convert input string to int
        System.out.println("Hello " + string + "\n");
*/
        System.out.println("\n Scanner \n");
        String string = "";
        int example = 0;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();

        //example = Integer.parseInt(string);
        example = scanner.nextInt();
        System.out.println("Hello " + string + "\n");
        System.out.println("Hello " + example + "\n");

    }
}
