package org.database.lab2.domain;

public class Teacher {
    private String Teacher_ID;
    private String Name;


    public Teacher(String teacher_ID, String name) {
        Teacher_ID = teacher_ID;
        Name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Teacher_ID='" + Teacher_ID + '\'' +
                ", Name='" + Name + "}";
    }

    public String getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(String teacher_ID) {
        Teacher_ID = teacher_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
