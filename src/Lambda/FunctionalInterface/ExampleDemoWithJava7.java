package Lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleDemoWithJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Asanka", "Lalith", 29),
                new Person("Haritha", "Nuwan", 28),
                new Person("Sameera", "Danushka", 27),
                new Person("Lahiru", "Dammika", 26),
                new Person("Chathuranga", "Sameera", 25),
                new Person("Panduka", "Dilun", 24),
                new Person("Gayan", "Isuru", 23)
        );

        //step 1 : sort list by last name
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //step 2 : Create a method that prints all elements in the list
        printAll(people);

        //step 3 : Create a method that prints all peaople that have last name beginning with D
        printLastNameBegginngWithD(people);
        //print with some condition
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("D");
            }
        });

    }

    private static void printLastNameBegginngWithD(List<Person> people) {
        for (Person person : people) {
            if (person.getLastName().startsWith("D"))
                System.out.println("\n"+person);
        }
    }
    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person))
                System.out.println("\n"+person);
        }
    }
    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

interface Condition{
    boolean test(Person person);
}