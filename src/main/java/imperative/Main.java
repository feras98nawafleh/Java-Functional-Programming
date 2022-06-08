package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.MALE;
import static imperative.Main.Person.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Feras", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Saleh", MALE),
                new Person("Alice", FEMALE)
        );

        // Imperative Approach
        List<Person> females = new ArrayList<>();
        for(Person person : people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for(Person female : females) {
            System.out.println(female);
        }
        // End of Imperative Approach

        // Declarative Approach
        people
                .stream()
                .filter(person -> person.gender.equals(FEMALE))
//                .collect(Collectors.toList()) *USE WHEN WE WANT TO COLLECT OUTPUT TO A NEW LIST*
                .forEach(System.out::println);
        // End of Declarative Approach
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
        enum Gender{
            MALE,
            FEMALE
        }
    }
}
