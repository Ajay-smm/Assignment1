package com.student.entity;
import jakarta.persistence.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Student")
public class Student {
    @Id
    private ObjectId id;
    @Field("roll")
    private Integer roll;

    private String name;


    public Student() {}

    public ObjectId getId()
    {

        return id;
    }

    public void setId(ObjectId id)
    {

        this.id = id;
    }

    public Integer getRoll()
    {

        return roll;
    }

    public void setRoll(Integer roll)
    {

        this.roll = roll;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


}
