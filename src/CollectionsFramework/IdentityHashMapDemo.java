package CollectionsFramework;

import java.util.*;
public class IdentityHashMapDemo {

    public static void main(String args[]) {
        // Create a hash map
        IdentityHashMap ihm = new IdentityHashMap();

        // Put elements to the map
        ihm.put("Kasun", new Double(3434.34));
        ihm.put("Dammika", new Double(123.22));
        ihm.put("Asanka", new Double(1378.00));
        ihm.put("Nuwan", new Double(99.22));
        ihm.put("Lalith", new Double(-19.08));

        // Get a set of the entries
        Set set = ihm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Kasun's account
        double balance = ((Double)ihm.get("Kasun")).doubleValue();
        ihm.put("Kasun", new Double(balance + 1000));
        System.out.println("Kasun's new balance: " + ihm.get("Kasun"));
    }
}
