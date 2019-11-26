package exercices.courses;

import java.util.List;

public class Student {
    // attributes
    private String firstName;
    private String lastName;
    private String cnp;
    private String email;
    private double avGrade;

    private int studyYear;
    private boolean isAccredited;
    public List<Course> courses;


    // constructor to initialize Student
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // *** setters ***
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public void setAccredited(boolean isAccredited) {
        this.isAccredited = isAccredited;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    // *** getters ***
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public String getEmail() {
        return email;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public boolean isAccredited() {
        return isAccredited;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // *** functions ***

    // print student attributes
    public void print() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("CNP: " + getCnp() + " / Study year: " + getStudyYear() + " / Average grade: " + getAvGrade() + " / Accredited: " + isAccredited());
        System.out.println("Courses taken: ");
        List<Course> courses = getCourses();
        if (courses != null) {
            for (Course course : getCourses()) {
                System.out.println(course.courseName);
            }
        } else {
            System.out.println("No courses taken yet.");
        }
        System.out.println();
    }

    // method to print courses list - only coursenames
    public void printCourses () {
/*        for (Course course: courses) {
            System.out.println(course.getCourseName());
        }*/
        System.out.println(firstName + " " + lastName + " - Courses taken: ");
        if (courses != null) {
            for (Course course : getCourses()) {
                System.out.println(course.courseName);
            }
        } else {
            System.out.println("No courses taken yet.");
        }
    }

    // method to join course
/*    public List<Course> joinCourse(Student student, Course course) {
        if (courses != null) {
            courses = getCourses();
        } else {
            courses = new ArrayList<>();
        }
        System.out.println("Student " + getFirstName() + " " + getLastName() + " joined " + course.courseName);
        courses.add(course);
        if (course.students != null) {
            course.students = course.getStudents();
        } else {
            course.students = new ArrayList<>();
        }
        course.students.add(student);
        return courses;
    }*/

    // method to retire from cours
/*    public List<Course> retireFromCourse(Student student, Course course) {
        System.out.println("Student " + getFirstName() + " " + getLastName() + " retired from " + course.courseName);
        courses.remove(course);
        if (course.students != null) {
            course.students = course.getStudents();
        } else {
            course.students = new ArrayList<>();
        }
        course.students.remove(student);
        return courses;
    }*/
}
