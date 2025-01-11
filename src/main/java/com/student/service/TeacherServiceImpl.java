package com.student.service;

import com.student.entity.Teacher;
import com.student.repository.TeacherRepository;
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
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public String saveTeacher(Teacher teacher) {

        teacherRepository.save(teacher);
        return "data posted successfully";

    }


    @Override
    public Teacher getATeacher (ObjectId id) {
        Teacher teacher = teacherRepository.findById(id).orElse(null);

        if (teacher != null) {
            return teacher;
        } else {
            throw new RuntimeException("Teacher not found with id: " + id);
        }

    }


    @Override
    public String updateTeacher(ObjectId id,  Teacher updatedTeacher) {
        Teacher existingTeacher = teacherRepository.findById(id).orElse(null);

        if (existingTeacher == null) {
            throw new RuntimeException("Teacher not found with id: " + id);
        }



        if (updatedTeacher.getName() != null) {
            existingTeacher.setName(updatedTeacher.getName());
        }
        if (updatedTeacher.getSubject() != null) {
            existingTeacher.setSubject(updatedTeacher.getSubject());
        }


        teacherRepository.save(existingTeacher);

        return "Teacher updated successfully";
    }


    @Override
    public String deleteTeacher(ObjectId id) {

        Teacher existingTeacher = teacherRepository.findById(id).orElse(null);

        if (existingTeacher == null) {
            throw new RuntimeException("Teacher not found with id: " + id);
        }

        teacherRepository.deleteById(id);

        return "Teacher deleted successfully";
    }

    @Override
    public Teacher getTeacherBySubject(String subject) {
        Teacher teacher = teacherRepository.findBySubject(subject);

        if (teacher != null) {
            return teacher;
        } else {
            throw new RuntimeException("Teacher not found with subject: " + subject);
        }
    }










}

