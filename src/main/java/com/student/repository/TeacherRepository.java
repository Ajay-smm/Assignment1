package com.student.repository;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import com.student.entity.Teacher;

//import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, ObjectId> {
    Teacher findBySubject(String subject);






}