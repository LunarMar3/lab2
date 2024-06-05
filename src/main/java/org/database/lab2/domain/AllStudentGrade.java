package org.database.lab2.domain;

public class AllStudentGrade {
    private Double Average;

    public AllStudentGrade(Double average) {
        Average = average;
    }

    @Override
    public String toString() {
        return "AllStudentGrade{" +
                "Average=" + Average +
                '}';
    }

    public Double getAverage() {
        return Average;
    }

    public void setAverage(Double average) {
        Average = average;
    }
}
