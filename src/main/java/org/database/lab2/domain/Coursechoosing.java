package org.database.lab2.domain;

public class Coursechoosing {
    private int ID;
    private String Student_ID;
    private String Course_ID;
    private String Teacher_ID;
    private int Chosen_year;

    public Coursechoosing(int ID, String student_ID, String course_ID, String teacher_ID, int chosen_year) {
        this.ID = ID;
        Student_ID = student_ID;
        Course_ID = course_ID;
        Teacher_ID = teacher_ID;
        Chosen_year = chosen_year;
    }

    @Override
    public String toString() {
        return "Coursechoosing{" +
                "ID=" + ID +
                ", Student_ID='" + Student_ID + '\'' +
                ", Course_ID='" + Course_ID + '\'' +
                ", Teacher_ID='" + Teacher_ID + '\'' +
                ", Chosen_year=" + Chosen_year +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(String student_ID) {
        Student_ID = student_ID;
    }

    public String getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(String course_ID) {
        Course_ID = course_ID;
    }

    public String getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        Teacher_ID = teacher_ID;
    }

    public int getChosen_year() {
        return Chosen_year;
    }

    public void setChosen_year(int chosen_year) {
        Chosen_year = chosen_year;
    }
}
