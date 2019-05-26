package Lambda.LambdaExceptionHandling;

import java.util.function.BiConsumer;

public class LambdaExceptionHandlingDemo {
    public static void main(String[] args) {
        int[] someNumber = {1, 2, 3, 4};
        int key = 0;
        //step->1 process(someNumber, key);
        //step-> 2 before try to catch exception process(someNumber, key, (v,k)-> System.out.println(v+k));
/*step-> other ways to catch exception
process(someNumber, key, (v, k) -> {

            try {
                System.out.println(v + k);
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
            }
        });
    }
*/
//step-> 5 using other method
        process(someNumber, key, wrapperLambda((v, k) -> System.out.println(v / k)));
        //-->Out Put
        /*I am in wrapper
Exception caught wrapper lambda java.lang.ArithmeticException: / by zero
I am in wrapper
Exception caught wrapper lambda java.lang.ArithmeticException: / by zero
I am in wrapper
Exception caught wrapper lambda java.lang.ArithmeticException: / by zero
I am in wrapper
Exception caught wrapper lambda java.lang.ArithmeticException: / by zero
*/
    }

/*step->1    private static void process(int[] someNumber, int key) {
                for (int i : someNumber) {
                    System.out.println(i + key);
                }
            }*/
/*step->2
private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {
    for (int i : someNumber) {
       consumer.accept(i, key);
    }
}*/
/* step-> 3 this is the one way to catch exception
   private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumber) {
            try {
                consumer.accept(i, key);
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
            }

        }
    }*/
//step -> 4 and step -> 5
    private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumber) {
            consumer.accept(i, key);
        }
    }

    /*//step -> 5
        private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
            return consumer;
        }*/
/*//step -> 6
private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
    return (v,k)->{
        System.out.println("I am in wrapper ");
        consumer.accept(v,k);
    };
}*/
//step -> 7
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                System.out.println("I am in wrapper ");
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught wrapper lambda " + e.toString());
            }

        };
    }
}
