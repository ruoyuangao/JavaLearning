package com.example.java26.homework2.repository;

import com.example.java26.homework2.pojo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findById(String id);
    public void deleteById(String id);
    public Student save(Student student);
}