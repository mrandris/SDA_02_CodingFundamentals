package exercices.courses;

import java.util.Date;
import java.util.List;

public class Topic {
    private String topicName;
    private List<String> subjects;
    private Date startDate;
    private Date endDate;
    private double numberOfHours;

    // constructor
    public Topic(String topicName, List<String> subjects ,Date startDate, Date endDate, double numberOfHours) {
        this.topicName = topicName;
        this.subjects = subjects;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfHours = numberOfHours;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
}
