package org.database.lab2.domain;

public class Student {
    private String Student_ID;
    private String Name;
    private String Sex;
    private String Entrance_Year;
    private Integer Entrance_Age;
    private String S_Class;

    @Override
    public String toString() {
        return "Student{" +
                "Student_ID='" + Student_ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Entrance_Year='" + Entrance_Year + '\'' +
                ", Entrance_Age=" + Entrance_Age +
                ", S_Class='" + S_Class + '\'' +
                '}';
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getEntrance_Year() {
        return Entrance_Year;
    }

    public void setEntrance_Year(String entrance_Year) {
        Entrance_Year = entrance_Year;
    }

    public Integer getEntrance_Age() {
        return Entrance_Age;
    }

    public void setEntrance_Age(Integer entrance_Age) {
        Entrance_Age = entrance_Age;
    }

    public String getS_Class() {
        return S_Class;
    }

    public void setS_Class(String s_Class) {
        S_Class = s_Class;
    }
}
