package CollectionsFramework;

import java.util.*;
public class LinkedHashMapDemo {

    public static void main(String args[]) {
        // Create a hash map
        LinkedHashMap lhm = new LinkedHashMap();

        // Put elements to the map
        lhm.put("Asanka", new Double(3434.34));
        lhm.put("Lalith", new Double(123.22));
        lhm.put("Nuwan", new Double(1378.00));
        lhm.put("Dammika", new Double(99.22));
        lhm.put("Manjula", new Double(-19.08));

        // Get a set of the entries
        Set set = lhm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Asanka's account
        double balance = ((Double)lhm.get("Asanka")).doubleValue();
        lhm.put("Asanka", new Double(balance + 1000));
        System.out.println("Asanka's new balance: " + lhm.get("Asanka"));
    }
}