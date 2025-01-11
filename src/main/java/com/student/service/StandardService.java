package com.student.service;

import com.student.entity.Standard;
import org.bson.types.ObjectId;

import java.util.List;


public interface StandardService {
    String saveStandard(Standard standard);
    Standard getAStandard(ObjectId id);
    String updateStandard( ObjectId id,  Standard updatedStandard);
    String deleteStandard(ObjectId id);
    Standard topStudent();
    //Standard getStandardBySubject(String subject);





}
