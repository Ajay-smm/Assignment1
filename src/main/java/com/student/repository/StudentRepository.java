package com.student.repository;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import com.student.entity.Student;

//import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, ObjectId> {


    //@Query(value = "{}", sort = "{'roll': 1}", limit = 3)
    @Query("{}")
    List<Student> printTopStudents(Pageable pageable);





}