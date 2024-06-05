package org.database.lab2.domain;

public class Grade {
    private String Student_ID;
    private String Course_ID;
    private Double score = 0.0;
    private String SName;
    private String CName;


    public Grade(String student_ID, String course_ID, Double score, String SName, String CName) {
        Student_ID = student_ID;
        Course_ID = course_ID;
        if (score == null) {
            this.score = 0.0;
        } else {
            this.score = score;
        }
        this.SName = SName;
        this.CName = CName;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "Student_ID='" + Student_ID + '\'' +
                ", Course_ID='" + Course_ID + '\'' +
                ", score=" + score +
                ", SName='" + SName + '\'' +
                ", CName='" + CName + '\'' +
                '}';
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        if (score == null) {
            this.score = 0.0;
        } else {
            this.score = score;
        }
    }
}
