package exercices.courses;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Course javaCluj7 = new Course("'Java Cluj - 7'");
        Course psd = new Course("'Learn Photoshop'");

        Student andras = new Student("Andras", "Nagy");
        Student beata = new Student("Beata", "Nagy-Mezei");

/*        andras.setCnp("1830509124797");
        andras.setEmail("aandrisnagy@gmail.com");
        andras.setStudyYear(1);
        andras.setAccredited(true);
        List<Course> andrasCourses = new ArrayList<>();
        andras.setCourses(andrasCourses);
        andrasCourses.add(javaCluj7);

        Student stefan = new Student("Stefan", "Stefanescu");
        Student ion = new Student("Ion", "Ionescu");

//        andras.print();
        printStudent(andras);

//        stefan.print();
        printStudent(stefan);
*/
        CourseManager cluj = new CourseManager();
//        SDACourse cluj7 = cluj.buildSDACourseCluj7();
//        cluj.printSDACourse(cluj7); // print already in builder

        cluj.joinCourse(andras, javaCluj7);
        cluj.joinCourse(andras, psd);
        andras.printCourses();
        javaCluj7.printStudents();
        System.out.println();

        beata.printCourses();
        System.out.println();

        cluj.joinCourse(beata, psd);
        beata.printCourses();
        System.out.println();

        cluj.retireFromCourse(andras, javaCluj7);
        andras.printCourses();
        javaCluj7.printStudents();
        System.out.println();

        cluj.retireFromCourse(andras, psd);
//        andras.printCourses();
        System.out.println();
        psd.printStudents();

    }

    // *** METHODS ***
    // print student with attributes
    private static void printStudent(Student student) {
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
/*        if (student.getCnp() != null) {
            System.out.print("CNP: " + student.getCnp() + " ");
        }
        if (student.getEmail() != null) {
            System.out.print("email: " + student.getEmail() + " ");
        }*/
        printString("CNP: ", student.getCnp());
        printString("email: ", student.getEmail());
        if (student.getStudyYear() != 0) {
            System.out.print("Study year: " + student.getStudyYear() + " ");
        }
        if (student.getAvGrade() != 0) {
            System.out.print("Average grade: " + student.getAvGrade() + " ");
        }
        if (student.isAccredited()) {
            System.out.print("Accredited: YES");
        } else {
            System.out.print("Accredited: NO");
        }
        System.out.println();
        System.out.println("Courses taken:");
        List<Course> courses = student.getCourses();
        if (courses != null) {
            for (Course course : student.getCourses()) {
                System.out.println(course.courseName);
            }
        } else {
            System.out.println("No courses taken yet.");
        }
        System.out.println();
    }

    // print string if not null - used in printStudent method
    private static void printString(String message, String str) {
        if (str != null) {
            System.out.print(message + str + " ");
        }
    }
}
