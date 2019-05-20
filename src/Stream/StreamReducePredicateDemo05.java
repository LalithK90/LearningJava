package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamReducePredicateDemo05 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
/*        int result = 0;
        for (int i:values){
            if (i%5==0){
                result +=i;
            }
        }
        System.out.println(result);*/
/*        System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0, (c, e) -> c + e));*/
/*        System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0, Integer::sum));*/
/*        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5==0;
            }
        };

        System.out.println(values.stream()
                .filter(predicate)
                .reduce(0, Integer::sum));*/

/*        System.out.println(values.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer%5==0;
                    }
                })
                .reduce(0, Integer::sum));*/

        System.out.println(values.stream()
                .filter(integer -> integer%5==0)
                .reduce(0, Integer::sum));

        System.out.println(values.stream()
                .filter(integer -> integer%5==0)
                .map(i->i*2)
                .reduce(0, Integer::sum));

        System.out.println(values.stream()
                .filter(integer -> integer%5==0)
                .map(i->i*2)
                .findFirst());
        System.out.println(values.stream()
                .filter(integer -> integer%5==0)
                .map(i->i*2)
                .findFirst().orElse(0));
    }
}
