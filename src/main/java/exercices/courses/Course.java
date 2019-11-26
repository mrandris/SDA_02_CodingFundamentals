package exercices.courses;

import java.util.List;

public class Course {
    // attributes
    public String courseName;
    public String teacher;
    public int maxStudents;
    public List<Student> students;

    // constructor to initialize Course
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // functions

    public void printStudents () {
        System.out.println(courseName + " - Students enrolled: ");
        if (students != null) {
            for (Student student : getStudents()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        } else {
            System.out.println(courseName + " - No students enrolled yet.");
        }
    }

    public void addStudent() {}
    public void deleteStudent() {}
}
