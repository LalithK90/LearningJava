package List;

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayDemo {
    public static void main(String[] args) {
        // vector default increase it size if when reach the capacity (Dynamic Array)
/*        Vector vector = new Vector();
        vector.add(10);
        vector.add(30);
        vector.add(20);
        vector.add(19);
        vector.add(18);
        vector.add(17);
        vector.add(16);
        vector.add(14);
        vector.add(11);
        vector.add(12);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println("Capacity of vector" + vector.capacity());

        for (Object object : vector) {
            System.out.println("Vector : " + object);
        }*/
/*        Vector<Integer> vector = new Vector<>();  --> increase capacity 100% , ThreadSafe, slow
        vector.add(10);
        vector.add(30);
        vector.add(20);
        vector.add(19);
        vector.add(18);
        vector.add(17);
        vector.add(16);
        vector.add(14);
        vector.add(11);
        vector.add(12);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println("Capacity of vector " + vector.capacity());
        vector.remove(6);

        for (int val : vector) {
            System.out.println("Vector : " + val);
        }*/
        ArrayList<Integer> arrayList = new ArrayList<>(); // increase capacity 50%, Not Threadsafe, Fast
        System.out.println("Array List size "+arrayList.size());
    }
}
