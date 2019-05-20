package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
/*        int result = 0;
        for (int i : values) {
            result += i;
        }
        System.out.println(result);
*/
/*        int result = 0;
        for (int i : values) {
            result += i*2;
        }
        System.out.println(result);*/
        //System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
 /*       Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        } ;
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        Stream<Integer> stream = values.stream();
        Stream stream1=stream.map(function);
        Integer result = (Integer) stream1.reduce(0,binaryOperator);

        System.out.println(result);*/
/*
        Stream<Integer> stream = values.stream();
        Stream stream1=stream.map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        });
        Integer result = (Integer) stream1.reduce(0,new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });

        System.out.println(result);*/
/*
        Stream<Integer> stream = values.stream();
        Stream stream1=stream.map(integer -> integer*2);
        Integer result = (Integer) stream1.reduce(0, (BinaryOperator<Integer>) (integer, integer2) -> integer+integer2);

        System.out.println(result);*/
/*
        Stream<Integer> stream = values.stream();
        Stream stream1=stream.map(integer -> integer*2);
        Integer result = (Integer) stream1.reduce(0, (BinaryOperator<Integer>) (integer, integer2) -> integer+integer2);

        System.out.println(result);*/
/*
        Stream stream1=values.stream().map(integer -> integer*2);
        Integer result = (Integer) stream1.reduce(0, (BinaryOperator<Integer>) (integer, integer2) -> integer+integer2);

        System.out.println(result);*/
/*
        Stream stream1=values.stream().map(integer -> integer*2);
        Integer result = (Integer) stream1.reduce(0, (BinaryOperator<Integer>) Integer::sum);

        System.out.println(result);*/
        Integer result = values.stream().map(integer -> integer*2).reduce(0, Integer::sum);
        System.out.println(result);
    }

}

