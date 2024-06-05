package org.database.lab2;

import org.database.lab2.domain.Coursechoosing;
import org.database.lab2.domain.Student;
import org.database.lab2.service.CoursechoosingService;
import org.database.lab2.service.GradeService;
import org.database.lab2.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class GradeDaoTest {

    @Autowired
    CoursechoosingService coursechoosingService;

    @Test
    public void updateTest(){
        System.out.println(coursechoosingService.getAllCourses());
    }
}
