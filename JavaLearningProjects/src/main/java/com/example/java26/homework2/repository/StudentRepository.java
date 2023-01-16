package com.example.java26.homework2.repository;

import com.example.java26.homework2.pojo.entity.Student;
import com.example.java26.week3.rest.demo1.pojo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository {
    Student findById(String id);
    Collection<Student> findAll();
}