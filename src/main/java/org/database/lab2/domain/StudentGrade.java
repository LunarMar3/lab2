package org.database.lab2.domain;

public class StudentGrade {
    private String Student_ID;
    private String Name;
    private Double Average;

    @Override
    public String toString() {
        return "StudentGrade{" +
                "Student_ID='" + Student_ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Average=" + Average +
                '}';
    }

    public StudentGrade(String student_ID, String name, Double average) {
        Student_ID = student_ID;
        Name = name;
        Average = average;
    }

    public String getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(String student_ID) {
        Student_ID = student_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getAverage() {
        return Average;
    }

    public void setAverage(Double average) {
        Average = average;
    }
}
