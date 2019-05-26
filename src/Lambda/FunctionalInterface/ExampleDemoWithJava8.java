package Lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ExampleDemoWithJava8 {
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
        printAll(people);

        //step 3 : Create a method that prints all peaople that have last name beginning with D
        printLastNameBegginngWithD(people);

        //print with some condition
        printConditionally(people, person -> person.getLastName().startsWith("D"));
        printConditionally(people, person -> person.getFirstName().startsWith("A"));

    }
    private static void printLastNameBegginngWithD(List<Person> people) {
        for (Person person : people) {
            if (person.getLastName().startsWith("D"))
                System.out.println("\n"+person);
        }
    }

/*    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person))
                System.out.println("\n"+person);
        }
    }*/
private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
    for (Person person : people) {
        if (predicate.test(person))
            System.out.println("\n"+person);
    }
}
    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

