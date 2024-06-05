package org.database.lab2.service;

import org.database.lab2.domain.Student;

import java.util.List;

public interface StudentService {
    public boolean save(Student student);

    public boolean update(Student student);

    public boolean delete(String id);

    public Student getByPara(String para);

    public List<Student> getAll();

}
