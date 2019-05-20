package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo01 {
    // External Iteration
    // Internal Iteration
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 32, 54);
/*        for (int i=0;i<9;i++){
            System.out.println(array.get(i));
        }
*/
/*        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/
/*
for (Integer integer:array){
    System.out.println(integer);
}
*/

//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
        //Consumer<Integer> consumer = (Integer integer) -> System.out.println(integer);
        //Consumer<Integer> consumer = integer -> System.out.println(integer);
        //Consumer<Integer> consumer = System.out::println;
        //array.forEach(consumer);

/*        array.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
*/
       // array.forEach(integer -> System.out.println(integer));
        array.forEach(System.out::println);



    }
}
