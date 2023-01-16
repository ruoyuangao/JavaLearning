package com.example.java26.homework2.pojo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


//studentInfo:
//id (primary key), name, age, gender, gpa
@Data
@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String gender;
    @Column
    private double gpa;
}
