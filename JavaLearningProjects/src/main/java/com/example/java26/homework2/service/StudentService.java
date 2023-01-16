package com.example.java26.homework2.service;

import com.example.java26.homework2.pojo.dto.StudentResponseDTO;
import com.example.java26.homework2.pojo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentResponseDTO getAllStu();
    StudentResponseDTO.StudentDTO getStuById(String id);
    Student createStu(Student student);
    Student updateStu(Student student);
    boolean deleteStuById(String id);
}
