package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student getStudentByName(String name);
    Student getStudentByEmail(String email);
    Student saveStudent(Student student);
    void deleteStudentById(long id);
}
