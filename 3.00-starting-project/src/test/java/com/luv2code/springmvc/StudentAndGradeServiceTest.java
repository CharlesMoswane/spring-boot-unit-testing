package com.luv2code.springmvc;

import com.luv2code.springmvc.models.CollegeStudent;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource("/application.properties")
@SpringBootTest
public class StudentAndGradeServiceTest {

    @Test
    public void createStudentService() {

        studentService.createStudent("Charles", "Moswane", "charles.moswane@luv2code_school.com");

        /*CollegeStudent student = studentDao.findByEmailAddress("charles.moswane@luv2code_school.com");

        assertEquals("charles.moswane@luv2code_school.com", student.getEmailAddress(), "find by email");*/
    }
}
