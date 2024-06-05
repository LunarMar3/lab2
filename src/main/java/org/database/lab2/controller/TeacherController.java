package org.database.lab2.controller;


import org.database.lab2.domain.Teacher;
import org.database.lab2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping(value = "/{para}")
    public Result getByPara(@PathVariable(value = "para") String para) {
        List<Teacher> teacher = teacherService.getByPara(para);
        Integer code = teacher != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = teacher != null ? "" : "failed";
        return new Result(code, teacher, message);
    }

    @GetMapping
    public Result getAll() {
        List<Teacher> teacherList = teacherService.getAll();
        Integer code = teacherList != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = teacherList != null ? "" : "failed";
        return new Result(code, teacherList, message);
    }
}
