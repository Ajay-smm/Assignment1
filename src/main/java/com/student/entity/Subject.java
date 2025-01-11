package com.student.entity;
import jakarta.persistence.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Subject")
public class Subject {
    @Id
    private ObjectId id;

    private String name;

    private Integer mark;


    public Subject() {}

    public ObjectId getId()
    {

        return id;
    }

    public void setId(ObjectId id)
    {

        this.id = id;
    }

    public Integer getMark()
    {

        return mark;
    }

    public void setMark(Integer mark)
    {

        this.mark = mark;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


}

