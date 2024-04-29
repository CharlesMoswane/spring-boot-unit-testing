package com.luv2code.springmvc;

import com.luv2code.springmvc.models.CollegeStudent;
import com.luv2code.springmvc.service.StudentAndGradeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource("/application.properties")
@SpringBootTest
public class StudentAndGradeServiceTest {

    @Autowired
    private StudentAndGradeService studentService;

    @Test
    public void createStudentService() {

        studentService.createStudent("Charles", "Moswane", "charles.moswane@luv2code_school.com");

        CollegeStudent student = studentDao.findByEmailAddress("charles.moswane@luv2code_school.com");

        assertEquals("charles.moswane@luv2code_school.com", student.getEmailAddress(), "find by email");
    }
}
