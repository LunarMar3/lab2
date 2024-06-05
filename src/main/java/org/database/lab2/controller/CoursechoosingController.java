package org.database.lab2.controller;

import org.database.lab2.domain.Coursechoosing;
import org.database.lab2.service.CoursechoosingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coursechoosing")
public class CoursechoosingController {

    @Autowired
    private CoursechoosingService coursechoosingService;

    @PostMapping
    public Result save(@RequestBody Coursechoosing coursechoosing) {
        System.out.println(coursechoosing);
        boolean flag = coursechoosingService.savecoursechoosing(coursechoosing);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @PutMapping
    public Result update(@RequestBody Coursechoosing coursechoosing) {
        boolean flag = coursechoosingService.updateCourse(coursechoosing);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @GetMapping(value = "/{para}")
    public Result getByPara(@PathVariable(value = "para") String para) {
        List<Coursechoosing> coursechoosing = coursechoosingService.getCourse(para);
        Integer code = coursechoosing != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = coursechoosing != null ? "" : "failed";

        return new Result(code, coursechoosing, message);
    }

    @GetMapping(value = "/{Student_ID}/{Teacher_ID}/{Course_ID}")
    public Result getCourse(@PathVariable String Student_ID, @PathVariable String Teacher_ID, @PathVariable String Course_ID) {
        Coursechoosing coursechoosing = coursechoosingService.checkCourse(Student_ID, Teacher_ID, Course_ID);
        Integer code = coursechoosing != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = coursechoosing != null ? "" : "failed";
        return new Result(code, coursechoosing, message);
    }

    ;

    @DeleteMapping(value = "/{Student_ID}/{Teacher_ID}/{Course_ID}")
    public Result delete(@PathVariable String Student_ID, @PathVariable String Teacher_ID, @PathVariable String Course_ID) {
        boolean flag = coursechoosingService.deleteCourse(Student_ID, Teacher_ID, Course_ID);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

    @GetMapping
    public Result getAll() {
        List<Coursechoosing> coursechoosingList = coursechoosingService.getAllCourses();
        Integer code = coursechoosingList != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = coursechoosingList != null ? "" : "failed";
        return new Result(code, coursechoosingList, message);
    }
}
