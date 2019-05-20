package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DoubleBraceInitializationListCollectionDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers1 = Arrays.asList(10, 11, 232, 2131, 313, 31, 3, 1);
        List<Integer> integers2 = new ArrayList<Integer>(){{
            add(90);
            add(902);
            add(904);
        }};
        Random random = new Random();

        for (int i = 0; i <= 5; i++) {
            integers.add(random.nextInt(10));
        }


        integers.forEach(System.out::println);
        System.out.println("                    ");
        integers1.forEach(System.out::println);
        System.out.println("                    ");
        integers2.forEach(System.out::println);
    }
}
