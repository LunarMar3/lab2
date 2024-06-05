package org.database.lab2.controller;

import org.database.lab2.domain.AllStudentGrade;
import org.database.lab2.domain.ClassGrade;
import org.database.lab2.domain.CourseGrade;
import org.database.lab2.domain.StudentGrade;
import org.database.lab2.service.AllStudentGradeService;
import org.database.lab2.service.ClassGradeService;
import org.database.lab2.service.CourseGradeService;
import org.database.lab2.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/average")
public class AverageController {

    @Autowired
    ClassGradeService classGradeService;

    @Autowired
    AllStudentGradeService allStudentGradeService;

    @Autowired
    CourseGradeService courseGradeService;

    @Autowired
    StudentGradeService studentGradeService;


    @GetMapping("/class")
    public List<ClassGrade> getClassAverage() {
        return classGradeService.getClassGrade();
    }

    @GetMapping("/course")
    public List<CourseGrade> getCourseAverage() {
        return courseGradeService.getCourseGrade();
    }

    @GetMapping("/student")
    public List<StudentGrade> getStudentAverage() {
        return studentGradeService.getStudentGrade();
    }

    @GetMapping("/all")
    public AllStudentGrade getAllStudentAverage() {
        return allStudentGradeService.getAllStudentGrade();
    }
}
