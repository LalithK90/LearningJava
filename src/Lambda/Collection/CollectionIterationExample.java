package Lambda.Collection;

import Lambda.FunctionalInterface.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
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

        System.out.println("Using for loop");
        //1
        for (int k = 0; k < people.size(); k++){
            System.out.println(people.get(k));
        }
        System.out.println("Using for in loop");
        //2   1 and 2 external iteration --> controlling by developer
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("Java 8 lambda forEach loop");
        people.forEach(p-> System.out.println(p));
        people.forEach(System.out::println);

    }
}
