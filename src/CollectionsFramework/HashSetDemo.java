package CollectionsFramework;

import java.util.*;
public class HashSetDemo {

    public static void main(String args[]) {
        // create a hash set
        HashSet hs = new HashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("C"); // this duplicate will remove
        hs.add("F");
        System.out.println(hs);
    }
}