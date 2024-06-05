package org.database.lab2.domain;

public class CourseGrade {
    private String Course;
    private Double Average;

    @Override
    public String toString() {
        return "CourseGrade{" +
                "Course='" + Course + '\'' +
                ", Average=" + Average +
                '}';
    }

    public CourseGrade(String course, Double average) {
        Course = course;
        Average = average;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public Double getAverage() {
        return Average;
    }

    public void setAverage(Double average) {
        Average = average;
    }
}
