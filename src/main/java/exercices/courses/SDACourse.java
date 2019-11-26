package exercices.courses;

import java.util.Date;
import java.util.List;

public class SDACourse {
    private List<Topic> topics;
    private String groupName;
    private int numberOfStudents;
    private Date startingDate;

    public SDACourse(String groupName, List<Topic> topics, int numberOfStudents, Date startingDate) {
        this.groupName = groupName;
        this.topics = topics;
        this.numberOfStudents = numberOfStudents;
        this.startingDate = startingDate;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
}
