package com.student.controller;

import com.student.entity.Teacher;
import com.student.service.TeacherService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;


    @GetMapping("/getadata/{id}")
    public Teacher getATeacherById(@PathVariable ObjectId id)
    {

        return teacherService.getATeacher(id);
    }

    @PostMapping("/postadata")
    public String createTeacherDetails(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @PutMapping("/updateadata/{id}")
    public String updateTeacherDetails(@PathVariable ObjectId id, @RequestBody Teacher updatedTeacher) {
        return teacherService.updateTeacher(id, updatedTeacher);
    }



    @DeleteMapping("/deleteadata/{id}")
    public String deleteTeacherDetails(@PathVariable ObjectId id) {

        return teacherService.deleteTeacher(id);
    }

    @GetMapping("/getbysubject/{subject}")
    public Teacher getTeacherBySubject(@PathVariable String subject) {
        return teacherService.getTeacherBySubject(subject);
    }




}
