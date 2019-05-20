package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(291);
        list.add(922);
        list.add(244);
        list.add(2, 109);

        // Comparator<Integer> comparator = new ComIml(); //1-step
/*   2-step
     Comparator<Integer> comparator = (o1,o2) -> {
        if (o1 % 10 > o2 % 10) {
                return 1;
            } else {
                return -1;
            }
        };*/
/*  3-step
   Comparator<Integer> comparator = (o1, o2) -> {
            if (o1 % 10 > o2 % 10)
                return 1;
            return -1;

        };*/

/*
   4-step
   Comparator<Integer> comparator = (o1, o2) -> {
             return o1 % 10 > o2 % 10 ? 1 : -1;
        };*/

        //Collections.sort(list);
        //Collections.reverse(list);

        //Collections.sort(list, comparator); //4-step

        Collections.sort(list, (o1, o2) -> {
            return o1 % 100 > o2 % 100 ? 1 : -1;

        });
        for (int a : list) {
            System.out.println(a);
        }
    }
}

/*
1-step
class ComIml implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 10 > o2 % 10) {
            return 1;
        } else {
            return -1;
        }
    }
}*/
