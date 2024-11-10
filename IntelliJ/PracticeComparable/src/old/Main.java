package old;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Charlie", 25, 50000.0));
        employees.add(new Employee(2, "Bob", 30, 60000.0));
        employees.add(new Employee(3, "Alice", 28, 55000.0));

        // Sort by name (alphabetical order)
        Collections.sort(employees, new compareName());

        System.out.println("Sorted by Name (alphabetical):");
        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}