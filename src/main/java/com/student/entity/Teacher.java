package com.student.entity;
import jakarta.persistence.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Teacher")
public class Teacher {
    @Id
    private ObjectId id;

    private String name;


    private String subject;


    public Teacher() {}

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

    public String getSubject() {

        return subject;
    }

    public void setSubject(String subject) {

        this.subject = subject;
    }


}
