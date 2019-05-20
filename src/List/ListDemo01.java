package List;

import java.util.*;

public class ListDemo01 {
    public static void main(String[] args) {


        //Specified for some data group
        List<Integer> list = new ArrayList<Integer>();
        list.add(29);
        list.add(9);
        list.add(2);
        list.add(2, 10);

/*        for (int integer : list) {
            System.out.println(integer);
        }*/
//before sort output-->
// 29
//  9
// 10
//  2
        Collections.sort(list);
        list.forEach(System.out::println); //Stream API Lambda Expression
//after sort output-->
//  2
//  9
//  10
//  29

    }

}


