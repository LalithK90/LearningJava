package CollectionsFramework;

import java.util.*;
public class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList
        List a1 = new ArrayList();
        a1.add("Nayana");
        a1.add("Amara");
        a1.add("Kamala");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
        List l1 = new LinkedList();
        l1.add("Nayana");
        l1.add("Amara");
        l1.add("Kamala");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Nayana");
        s1.add("Amara");
        s1.add("Kamala");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Nayana", "8");
        m1.put("Amara", "31");
        m1.put("Kamala", "12");
        m1.put("Chathura", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}