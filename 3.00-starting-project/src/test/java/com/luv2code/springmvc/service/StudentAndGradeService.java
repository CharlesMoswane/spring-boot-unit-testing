package com.luv2code.springmvc.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentAndGradeService {
    public void createStudent(String name, String surname, String email) {
    }
}
