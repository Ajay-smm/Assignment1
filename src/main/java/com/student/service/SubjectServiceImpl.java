package com.student.service;

import com.student.entity.Subject;
import com.student.repository.SubjectRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public String saveSubject(Subject subject) {

        subjectRepository.save(subject);
        return "data posted successfully";

    }


    @Override
    public Subject getASubject (ObjectId id) {
        Subject subject = subjectRepository.findById(id).orElse(null);

        if (subject != null) {
            return subject;
        } else {
            throw new RuntimeException("Subject not found with id: " + id);
        }

    }


    @Override
    public String updateSubject(ObjectId id,  Subject updatedSubject) {
        Subject existingSubject = subjectRepository.findById(id).orElse(null);

        if (existingSubject == null) {
            throw new RuntimeException("Subject not found with id: " + id);
        }



        if (updatedSubject.getName() != null) {
            existingSubject.setName(updatedSubject.getName());
        }
        if (updatedSubject.getMark() != null) {
            existingSubject.setMark(updatedSubject.getMark());
        }


        subjectRepository.save(existingSubject);

        return "Subject updated successfully";
    }


    @Override
    public String deleteSubject(ObjectId id) {

        Subject existingSubject = subjectRepository.findById(id).orElse(null);

        if (existingSubject == null) {
            throw new RuntimeException("Subject not found with id: " + id);
        }

        subjectRepository.deleteById(id);

        return "Subject deleted successfully";
    }

    @Override
    public Subject getMarkBySubject(String name) {
        Subject subject = subjectRepository.findByName(name);

        if (subject != null) {
            return subject;
        } else {
            throw new RuntimeException("mark not found with subject: " + name);
        }
    }










}

