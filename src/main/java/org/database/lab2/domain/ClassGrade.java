package org.database.lab2.domain;

public class ClassGrade {
    private String s_Class;
    private Double Average;

    public String getS_Class() {
        return s_Class;
    }

    public void setS_Class(String s_Class) {
        this.s_Class = s_Class;
    }

    public Double getAverage() {
        return Average;
    }

    public void setAverage(Double average) {
        Average = average;
    }

    public ClassGrade(String s_Class, Double average) {
        this.s_Class = s_Class;
        Average = average;
    }

    @Override
    public String toString() {
        return "ClassGrade{" +
                "s_Class='" + s_Class + '\'' +
                ", Average=" + Average +
                '}';
    }
}
