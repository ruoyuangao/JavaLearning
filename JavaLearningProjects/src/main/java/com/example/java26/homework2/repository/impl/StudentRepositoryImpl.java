package com.example.java26.homework2.repository.impl;

import com.example.java26.homework2.repository.StudentRepository;
import com.example.java26.homework2.service.impl.StudentServiceImpl;
import com.example.java26.homework2.pojo.entity.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final Map<String, Student> map = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        map.put("1", new Student("1", "Tom", 18,"Female", 3.80, new Date(), true));
        map.put("2", new Student("2", "Jerry", 21, "Male", 2.95, new Date(), false));
    }

    @Override
    public Student findById(String id) {
        return map.get(id);
    }

    @Override
    public Collection<Student> findAll() {
        return map.values();
    }
}
