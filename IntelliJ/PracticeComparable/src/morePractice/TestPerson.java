package morePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 40));
        people.add(new Person("Eve", 22));

        // Sorting by proximity to 'C'
        char condition = 'C';
        System.out.println("Sorting by alphabetical proximity to '" + condition + "':");
        Collections.sort(people, new Person.AlphabeticalCondition(condition));

        // Printing sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
