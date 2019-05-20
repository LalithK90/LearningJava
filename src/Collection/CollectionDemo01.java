package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo01 {
    /*    |--------------------------------->|---------->|
        Collection(1.2 and Genaric 1.5) --> List  --> ArrayList

        Set<> -> hashSet<>() ==> no duplicate
                  treeSet<>() ==> 5 6 8 2 3 9

        Map<key type ,value type > HashMap<>()
        */
    public static void main(String[] args) {
/*        int[] val = new int[10];
        Object[] valObj = new Object[9];
        valObj[0] = "Lalith";
        valObj[1] = 29;*/

        Collection collections = new ArrayList();
        collections.add("Asanka");
        collections.add("Lalith");
        collections.add(29);

        //Specified for some data group
        Collection<Integer> collection1 = new ArrayList<Integer>();
        collection1.add(29);
        collection1.add(9);
        collection1.add(2);

//fetch data from collection
        //Iterator and enhanced For Loop
/*
    Old Method
        Iterator iterator = collections.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using Iterator : " + iterator.next());
        }*/

        for (Object object : collections) {
            System.out.println(object);
        }
        for (int integer : collection1) {
            System.out.println(integer);
        }
    }

}


