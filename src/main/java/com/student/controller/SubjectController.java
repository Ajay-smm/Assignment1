package com.student.controller;

import com.student.entity.Subject;
import com.student.service.SubjectService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;


    @GetMapping("/getadata/{id}")
    public Subject getASubjectById(@PathVariable ObjectId id)
    {

        return subjectService.getASubject(id);
    }

    @PostMapping("/postadata")
    public String createSubjectDetails(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }

    @PutMapping("/updateadata/{id}")
    public String updateSubjectDetails(@PathVariable ObjectId id, @RequestBody Subject updatedSubject) {
        return subjectService.updateSubject(id, updatedSubject);
    }



    @DeleteMapping("/deleteadata/{id}")
    public String deleteSubjectDetails(@PathVariable ObjectId id) {

        return subjectService.deleteSubject(id);
    }

    @GetMapping("/getmarkbysubject/{name}")
    public Subject getMarkBySubject(@PathVariable String name)
    {
        return subjectService.getMarkBySubject(name);
    }




}
