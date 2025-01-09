package com.student.service;

import com.student.entity.Student;
import org.bson.types.ObjectId;

import java.util.List;


public interface StudentService {
    String saveStudent(Student student);
    Student getAStudent(ObjectId id);
    String updateStudent( ObjectId id,  Student updatedStudent);
    String deleteStudent(ObjectId id);
    List<Student> topThreeStudents();




}
