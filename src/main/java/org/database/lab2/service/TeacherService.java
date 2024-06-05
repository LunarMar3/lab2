package org.database.lab2.service;

import org.database.lab2.domain.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getByPara(String para);

    List<Teacher> getAll();
}
