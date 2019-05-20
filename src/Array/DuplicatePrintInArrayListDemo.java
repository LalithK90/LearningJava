package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatePrintInArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lalith");
        names.add("Asanka");
        names.add("Nuwan");
        names.add("Lalith");
        names.add("Nuwan");

        Set<String> setString = new HashSet<>();




        for (String string: names){
            if (!setString.add(string))
            System.out.println(string);
        }
    }
}
