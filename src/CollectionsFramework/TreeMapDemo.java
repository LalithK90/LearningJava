package CollectionsFramework;

import java.util.*;
public class TreeMapDemo {

    public static void main(String args[]) {
        // Create a hash map
        TreeMap tm = new TreeMap();

        // Put elements to the map
        tm.put("Amal", new Double(3434.34));
        tm.put("Nuwan", new Double(123.22));
        tm.put("Asanka", new Double(1378.00));
        tm.put("Lalith", new Double(99.22));
        tm.put("Janaka", new Double(-19.08));

        // Get a set of the entries
        Set set = tm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Amal's account
        double balance = ((Double)tm.get("Amal")).doubleValue();
        tm.put("Amal", new Double(balance + 1000));
        System.out.println("Amal's new balance: " + tm.get("Amal"));
    }
}
