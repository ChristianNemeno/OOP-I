package Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of courses
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics", 30, "MATH101"));
        courses.add(new Course("Physics", 25, "PHYS101"));
        courses.add(new Course("Chemistry", 30, "CHEM101"));
        courses.add(new Course("Biology", 25, "BIO101"));
        courses.add(new Course("History", 30, "HIST101"));
        courses.add(new Course("Mathematics", 30, "MATH102"));


        Comparator<Course> byStudentCount = Comparator.comparing(Course :: getStudentCount).reversed()
                .thenComparing(Course :: getCourseCode)
                .thenComparing(Course :: getCourseName);
        // Sort by student count (and by course code and name if counts are the same)
        System.out.println("Before: ");
        for (Course course : courses) {
            System.out.println(course);
        }
        System.out.println();
        Collections.sort(courses,byStudentCount);

        // Print the sorted list
        System.out.println("Courses sorted by student count , then course code, then course name:");
        for (Course course : courses) {
            System.out.println(course);
        }


    }

}
