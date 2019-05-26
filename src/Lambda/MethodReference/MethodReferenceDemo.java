package Lambda.MethodReference;

import Lambda.FunctionalInterface.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceDemo {
    public static void main(String[] args) {
/*//Thread thread = new Thread(()->printMessage());
        Thread thread = new Thread(MethodReferenceDemo::printMessage);//()->printMessage() === MethodReferenceDemo::printMessage
        thread.start();
    }

    public static void printMessage() {
        System.out.println("Wellcome to Lambda");
    }*/

        List<Person> people = Arrays.asList(
                new Person("Asanka", "Lalith", 29),
                new Person("Haritha", "Nuwan", 28),
                new Person("Sameera", "Danushka", 27),
                new Person("Lahiru", "Dammika", 26),
                new Person("Chathuranga", "Sameera", 25),
                new Person("Panduka", "Dilun", 24),
                new Person("Athula", "Isuru", 23)
        );

        performConditionally(people, p -> true, System.out::println); // p -> System.out.println(p) === System.out::println


    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person))
                consumer.accept(person);
        }


    }
}
