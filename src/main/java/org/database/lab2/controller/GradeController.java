package org.database.lab2.controller;


import org.database.lab2.domain.Grade;
import org.database.lab2.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    GradeService gradeService;

    @GetMapping(value = "/{para1}/{para2}")
    public Result getByPara(@PathVariable(value = "para1") String para1, @PathVariable(value = "para2") String para2) {
        Grade grade = gradeService.getGrade(para1, para2);
        Integer code = grade != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = grade != null ? "" : "failed";
        return new Result(code, grade, message);
    }

    @GetMapping
    public Result getAll() {
        List<Grade> gradeList = gradeService.getGrades();
        Integer code = gradeList != null ? Code.SUCCESS_CODE : Code.ERROR_CODE;
        String message = gradeList != null ? "" : "failed";
        return new Result(code, gradeList, message);
    }

    @PutMapping("/{Student_ID}/{Course_ID}")
    public Result update(@PathVariable(value = "Student_ID") String studentId, @PathVariable(value = "Course_ID") String courseId, @RequestParam(value = "score") Double score) {
        boolean flag = gradeService.updateGrade(score, studentId, courseId);
        return new Result(flag ? Code.SUCCESS_CODE : Code.ERROR_CODE, flag);
    }

}
