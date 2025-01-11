package com.student.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Standard")
public class Standard {
    @Id
    private ObjectId id;

    private String name;


    private Integer rank;


    public Standard() {}

    public ObjectId getId()
    {

        return id;
    }

    public void setId(ObjectId id)
    {

        this.id = id;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public Integer getRank() {

        return rank;
    }

    public void setRank(Integer rank) {

        this.rank = rank;
    }


}
