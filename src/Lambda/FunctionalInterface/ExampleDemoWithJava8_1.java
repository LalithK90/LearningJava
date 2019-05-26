package Lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExampleDemoWithJava8_1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Asanka", "Lalith", 29),
                new Person("Haritha", "Nuwan", 28),
                new Person("Sameera", "Danushka", 27),
                new Person("Lahiru", "Dammika", 26),
                new Person("Chathuranga", "Sameera", 25),
                new Person("Panduka", "Dilun", 24),
                new Person("Athula", "Isuru", 23)
        );

        //step 1 : sort list by last name
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        Collections.sort(people, Comparator.comparing(Person::getLastName));
        //step 2 : Create a method that prints all elements in the list
        performConditionally(people, p->true,p-> System.out.println(p));

        //step 3 : Create a method that prints all peaople that have last name beginning with D
        //print with some condition
        performConditionally(people, person -> person.getLastName().startsWith("D"),person -> System.out.println(person));
        performConditionally(people, person -> person.getFirstName().startsWith("A"), System.out::println);

    }
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person))
                consumer.accept(person);
        }
    }
}

