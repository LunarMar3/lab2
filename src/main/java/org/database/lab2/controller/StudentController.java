package org.database.lab2.controller;

import org.database.lab2.domain.Student;
import org.database.lab2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Result save(@RequestBody Student student) {
        boolean flag = studentService.save(student);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @PutMapping
    public Result update(@RequestBody Student student) {
        boolean flag = studentService.update(student);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable(value = "id") String id) {
        boolean flag = studentService.delete(id);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @GetMapping(value = "/{para}")
    public Result getByPara(@PathVariable(value = "para") String para) {
        Student student = studentService.getByPara(para);
        Integer code = student != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = student != null ? "" : "failed";

        return new Result(code, student, message);
    }

    @GetMapping
    public Result getAll() {
        List<Student> studentList = studentService.getAll();
        Integer code = studentList != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = studentList != null ? "" : "failed";

        return new Result(code, studentList, message);
    }
}
