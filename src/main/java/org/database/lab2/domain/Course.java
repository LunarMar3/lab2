package org.database.lab2.domain;

public class Course {
    private String Course_ID;
    private String Name;
    private String Credit;
    private String Grade;
    private String Canceled_Year;

    public Course(String course_ID, String name, String credit, String grade, String canceled_Year) {
        Course_ID = course_ID;
        Name = name;
        Credit = credit;
        Grade = grade;
        Canceled_Year = canceled_Year;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Course_ID='" + Course_ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Credit='" + Credit + '\'' +
                ", Grade='" + Grade + '\'' +
                ", Canceled_Year='" + Canceled_Year + '\'' +
                '}';
    }

    public String getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(String course_ID) {
        Course_ID = course_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String credit) {
        Credit = credit;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getCanceled_Year() {
        return Canceled_Year;
    }

    public void setCanceled_Year(String canceled_Year) {
        Canceled_Year = canceled_Year;
    }

}
