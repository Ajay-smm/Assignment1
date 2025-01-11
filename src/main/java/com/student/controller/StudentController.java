package com.student.controller;

import com.student.entity.Student;
import com.student.entity.Teacher;
import com.student.service.StudentService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

        @Autowired
        StudentService studentService;


        @GetMapping("/getadata/{id}")
        public Student getAStudentById(@PathVariable ObjectId id)
        {

            return studentService.getAStudent(id);
        }

        @PostMapping("/postadata")
        public String createStudentDetails(@RequestBody Student student) {

            return studentService.saveStudent(student);
        }

        @PutMapping("/updateadata/{id}")
        public String updateStudentDetails(@PathVariable ObjectId id, @RequestBody Student updatedStudent) {
            return studentService.updateStudent(id, updatedStudent);
        }



         @DeleteMapping("/deleteadata/{id}")
        public String deleteStudentDetails(@PathVariable ObjectId id) {

            return studentService.deleteStudent(id);
        }

        @GetMapping("/topstudents")
        public List<Student> getTopStudents()
        {

            return studentService.topThreeStudents();
        }

       @GetMapping("/getbyname/{name}")
       public Student getStudentByName(@PathVariable String name) {
            return studentService.getStudentByName(name);

       }

    }
