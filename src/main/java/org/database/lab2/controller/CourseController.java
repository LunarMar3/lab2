package org.database.lab2.controller;


import org.database.lab2.domain.Course;
import org.database.lab2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public Result save(@RequestBody Course course) {
        boolean flag = courseService.saveCourse(course);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @PutMapping
    public Result update(@RequestBody Course course) {
        boolean flag = courseService.updateCourse(course);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable(value = "id") String id) {
        boolean flag = courseService.deleteCourse(id);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @GetMapping(value = "/{para}")
    public Result getByPara(@PathVariable(value = "para") String para) {
        Course course = courseService.getCourse(para);
        Integer code = course != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = course != null ? "" : "failed";

        return new Result(code, course, message);
    }

    @GetMapping
    public Result getAll() {
        List<Course> courseList = courseService.getAllCourses();
        Integer code = courseList != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = courseList != null ? "" : "failed";

        return new Result(code, courseList, message);
    }
}
