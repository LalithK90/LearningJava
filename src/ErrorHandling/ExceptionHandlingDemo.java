package ErrorHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class ExceptionHandlingDemo {
    /*
    Error                  it is a class
                            ^
                            |
                         Throwable
                             ^
                             |
          Exception <-----------------> Error
          (Can handled)                   (Can not handled)
                   |
               ----------
               |        |
          Checked  Unchecked
=========================================================================================
            |-> Normal                                                                  |
Statement --|                                                                           |
            |-> Critical                                                                |
                    |-> try{ Throw exception                                            |
                            }                                                           |
                            catch(){ catch exception                                    |
                            }                                                           |
                            When catch(Exception e) --> catch all type of exception     |
=========================================================================================
========================================================
            Exception                                  |
Execution  ----- *                * Continue process   |
                 |                |                    |
             If can handle        |                    |
                 |                |                    |
                 --------->-------                     |
                        Checked                        |
========================================================

Short note

        Throwable --> Can handle all Exception and Errors
            |==> Exception
            |       | --> Checked
            |       |        |->IOException
            |       |        |->SQLException
            |       |  --> Unchecked
            |                |->  RunTimeException
            |                       -> Arithmetic
            |                       ->
            |==> Error



    */
    public static void main(String[] args) {
        int i, j, k = 0;
        int[] a = new int[4];
        i = 10;
        j = 0;
        //k = i / j;
        System.out.println("\n ArithmeticException\n");
        try {
            k = i / j;
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
        //System.out.println(k);
        System.out.println("\n ArrayIndexOutOfBoundsException \n");
        try {
            for (int c = 0; c <= 4; c++) {
                a[c] = c + 1;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
 // NOt work properly ==>
/*

        System.out.println("\n Some Exception in one \n");
        try {
            k = i / j;

            for (int c = 0; c <= 4; c++) {
                a[c] = c + 1;
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception " + e);
        } catch (java.lang.ArrayIndexOutOfBoundsException f) {
            System.out.println("Exception " + f);
        }
       // ====================================================
        try {
            k = i / j;

            for (int c = 0; c <= 4; c++) {
                a[c] = c + 1;
            }
        } catch (ArithmeticException | java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception " + e);
        }
       // ====================================================


*/

// need to check IOException all All above method
int l=7;
int m =0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(bufferedReader.readLine());
            m = l/x;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }finally {// when catch some exception system work stop but finally block help to
            System.out.println("Bye");
        }
    }
}
