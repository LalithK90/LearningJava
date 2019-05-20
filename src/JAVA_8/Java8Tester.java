package JAVA_8;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Java8Tester {

    public static void main(String args[]) {

        List<String> names1 = new ArrayList<String>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Nuwan ");
        names1.add("Kasun ");
        names1.add("Asanka ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Nuwan ");
        names2.add("Kasun ");
        names2.add("Asanka ");

        Java8Tester tester = new Java8Tester();
        System.out.println("Sort using Java 7 syntax: ");

        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax: ");

        tester.sortUsingJava8(names2);
        System.out.println(names2);
    }

    //sort using java 7
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
