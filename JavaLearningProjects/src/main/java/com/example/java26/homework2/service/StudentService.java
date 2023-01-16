package com.example.java26.homework2.service;

import com.example.java26.homework2.pojo.dto.StudentResponseDTO;
import com.example.java26.week3.rest.demo1.pojo.dto.EmployeeResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentResponseDTO getAllStu();
    StudentResponseDTO.StudentDTO getStuById(String id);
}
