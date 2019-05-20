package CollectionsFramework;

import java.util.*;
public class HashMapDemo {

    public static void main(String args[]) {

        // Create a hash map
        HashMap hm = new HashMap();

        // Put elements to the map
        hm.put("Nuwan", new Double(3434.34));
        hm.put("Dilun", new Double(123.22));
        hm.put("Lalith", new Double(1378.00));
        hm.put("Asanka", new Double(99.22));
        hm.put("Dammika", new Double(-19.08));

        // Get a set of the entries
        Set set = hm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Nuwan's account
        double balance = ((Double)hm.get("Nuwan")).doubleValue();
        hm.put("Nuwan", new Double(balance + 1000));
        System.out.println("Nuwan's new balance: " + hm.get("Nuwan"));
    }
}
