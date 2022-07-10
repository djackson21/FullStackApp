package com.derron.studentsystem.service;

import com.derron.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
