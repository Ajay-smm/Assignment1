package com.student.service;

import com.student.entity.Student;
import com.student.entity.Teacher;
import com.student.repository.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//import java.awt.print.Pageable;
import java.util.List;


@Service
    public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {

            studentRepository.save(student);
            return "data posted successfully";

    }


        @Override
        public Student getAStudent (ObjectId id) {
            Student student = studentRepository.findById(id).orElse(null);

            if (student != null) {
                return student;
            } else {
                throw new RuntimeException("Student not found with id: " + id);
            }

        }


            @Override
            public String updateStudent(ObjectId id,  Student updatedStudent) {
                Student existingStudent = studentRepository.findById(id).orElse(null);

                if (existingStudent == null) {
                    throw new RuntimeException("Student not found with id: " + id);
                }


                if (updatedStudent.getRoll() != null) {
                    existingStudent.setRoll(updatedStudent.getRoll());
                }
                if (updatedStudent.getName() != null) {
                    existingStudent.setName(updatedStudent.getName());
                }

                studentRepository.save(existingStudent);

                return "Student updated successfully";
            }


        @Override
        public String deleteStudent(ObjectId id) {

            Student existingStudent = studentRepository.findById(id).orElse(null);

            if (existingStudent == null) {
                throw new RuntimeException("Student not found with id: " + id);
            }

            studentRepository.deleteById(id);

            return "Student deleted successfully";
        }

        @Override
        public List<Student> topThreeStudents() {
            Pageable topThree = PageRequest.of(0, 3, Sort.by("roll").ascending());

            return studentRepository.printTopStudents(topThree);

        }

    @Override
    public Student getStudentByName(String name) {
        Student student = studentRepository.findByName(name);

        if (student != null) {
            return student;
        } else {
            throw new RuntimeException("Student not found with name: " + name);
        }
    }


}

