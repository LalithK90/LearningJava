package CollectionsFramework;

import java.util.*;
public class HashTableDemo {

    public static void main(String args[]) {
        // Create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Lalith", new Double(3434.34));
        balance.put("Kasun", new Double(123.22));
        balance.put("Dammika", new Double(1378.00));
        balance.put("Nuwan", new Double(99.22));
        balance.put("Asanka", new Double(-19.08));

        // Show all balances in hash table.
        names = balance.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Deposit 1,000 into Lalith's account
        bal = ((Double)balance.get("Lalith")).doubleValue();
        balance.put("Lalith", new Double(bal + 1000));
        System.out.println("Lalith's new balance: " + balance.get("Lalith"));
    }
}