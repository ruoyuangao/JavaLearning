package com.example.java26.homework2.service.impl;

import com.example.java26.homework2.pojo.dto.StudentResponseDTO;
import com.example.java26.homework2.pojo.entity.Student;
import com.example.java26.homework2.repository.StudentRepository;
import com.example.java26.homework2.service.StudentService;
import com.example.java26.homework2.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentResponseDTO getAllStu() {
        Collection<Student> studentCollection = studentRepository.findAll();
        List<StudentResponseDTO.StudentDTO> studentDTOS = studentCollection
                .stream()
                .map(e -> new StudentResponseDTO.StudentDTO(e))
                .collect(Collectors.toList());
        return new StudentResponseDTO(studentDTOS);
    }

    @Override
    public StudentResponseDTO.StudentDTO getStuById(String id) {

        Student student = studentRepository.findById(id);

        if(student == null) {
            throw new ResourceNotFoundException("..");
        }
        return new StudentResponseDTO.StudentDTO(student);
    }

    @Override
    public Student createStu(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student updateStu(Student student){
        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStuById(String id) {
        boolean result = true;
        try {
            studentRepository.deleteById(id);
        }
        catch (Exception e) {
            result = false;
        }
        return result;

    }




}
