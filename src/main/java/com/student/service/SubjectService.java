package com.student.service;

import com.student.entity.Subject;
import org.bson.types.ObjectId;


public interface SubjectService {
    String saveSubject(Subject subject);
    Subject getASubject(ObjectId id);
    String updateSubject( ObjectId id,  Subject updatedSubject);
    String deleteSubject(ObjectId id);
    Subject getMarkBySubject(String name);





}
