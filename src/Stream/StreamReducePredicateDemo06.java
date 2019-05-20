package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamReducePredicateDemo06 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        int result = 0;
        for (int i : values) {
            if (i % 5 == 0) {
                result = i * 2;
                break;
            }
        }
        System.out.println(result);


        System.out.println(values.stream()
                .filter(integer -> integer % 5 == 0)
                .map(i -> i * 2)
                .findFirst().orElse(0));
    }
}