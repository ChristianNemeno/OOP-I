package Course;

import java.util.Comparator;

public class Course{
    private String courseName;
    private int studentCount;
    private String courseCode;

    // Constructor
    public Course(String courseName, int studentCount, String courseCode) {
        this.courseName = courseName;
        this.studentCount = studentCount;
        this.courseCode = courseCode;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString(){
        return courseName + " " + courseCode + " " + studentCount;
    }




}