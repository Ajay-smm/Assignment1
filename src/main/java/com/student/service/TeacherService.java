package com.student.service;

import com.student.entity.Teacher;
import org.bson.types.ObjectId;

import java.util.List;


public interface TeacherService {
    String saveTeacher(Teacher teacher);
    Teacher getATeacher(ObjectId id);
    String updateTeacher( ObjectId id,  Teacher updatedTeacher);
    String deleteTeacher(ObjectId id);
    Teacher getTeacherBySubject(String subject);





}
