package com.student.repository;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.student.entity.Standard;



@Repository
public interface StandardRepository extends MongoRepository<Standard, ObjectId> {


    Standard findTopByOrderByRankAsc();



}