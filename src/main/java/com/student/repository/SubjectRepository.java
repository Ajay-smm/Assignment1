package com.student.repository;

import com.student.entity.Subject;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;




@Repository
public interface SubjectRepository extends MongoRepository<Subject, ObjectId> {
    Subject findByName(String name);






}