package Lambda.Streams;

/*
Streams --> A sequence of elements supporting sequential and parallel aggregate operations


*/


import Lambda.FunctionalInterface.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
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

        people.stream()
                .filter(p -> p.getLastName().startsWith("D"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();
        System.out.println(count);

        long countParalle = people.parallelStream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();

        System.out.println(countParalle);

    }

}
