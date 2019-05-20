package JAVA_8;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester3 {

    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Kasun");
        names.add("Nuwan");
        names.add("Kalpa");

        names.forEach(System.out::println);
    }
}