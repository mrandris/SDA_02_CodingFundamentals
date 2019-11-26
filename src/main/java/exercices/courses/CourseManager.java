package exercices.courses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseManager {
    // method to join course
    public List<Course> joinCourse(Student student, Course course) {
        if (student.getCourses() != null) {
            student.courses = student.getCourses();
        } else {
            student.courses = new ArrayList<>();
        }
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " joined " + course.courseName);
        student.courses.add(course);
        if (course.students != null) {
            course.students = course.getStudents();
        } else {
            course.students = new ArrayList<>();
        }
        course.students.add(student);
        return student.courses;
    }

    // method to retire from cours
    public List<Course> retireFromCourse(Student student, Course course) {
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " retired from " + course.courseName);
        student.courses.remove(course);
        if (course.students != null) {
            course.students = course.getStudents();
        } else {
            course.students = new ArrayList<>();
        }
        course.students.remove(student);
        return student.courses;
    }

    // method to build course
    public SDACourse buildSDACourseCluj7() {
        SDACourse cluj7 = new SDACourse("'Java Cluj 7'", buildTopicListCluj7() ,20, stringToDate("2019-04-20"));
        printSDACourse(cluj7);
        return cluj7;
    }

    // method - transforms string to date
    private Date stringToDate(String dateAsString) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateFromString = dateFormat.parse(dateAsString);
            return dateFromString;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    // method to build list of topics
    private List<Topic> buildTopicListCluj7() {
        List<Topic> topics = new ArrayList<Topic>();
//        topics.add(codingFundamentals());
        return topics;
    }

    // build a generic topic
    private Topic buildGenericTopic(String name, List<String> subjects, String startDate, String endDate, double numberOfHours) {
        Topic genericTopic = new Topic(name, subjects, stringToDate(startDate), stringToDate(endDate), numberOfHours);
        return genericTopic;
    }

    // build specific topic
    private Topic codingFundamentals() {
        List<String> subjects = new ArrayList<String>();
        subjects.add("Data structures");
        subjects.add("Algorithms");
        Topic codingFundamentals = buildGenericTopic("Coding fundamentals", subjects,
                "2019-04-20","2019-06-23", 35);
        return codingFundamentals;
    }

    // print course
    public void printSDACourse(SDACourse course) {
        System.out.println("Group name: " + course.getGroupName());
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("Starting date: " + course.getStartingDate());
        System.out.println("Topics:");
        List<Topic> topics = course.getTopics();
        for (Topic topic : topics) {
            System.out.println(topic.getTopicName());
        }
        System.out.println();
    }
}
