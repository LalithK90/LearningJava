package ErrorHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        //Step one
       /* BufferedReader bufferedReader = null;
        try {
            String s = " ";
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            s = bufferedReader.readLine();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            bufferedReader.close();
        }*/

        //Step two
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = " ";
            s = bufferedReader.readLine();

        }
    }
}
