package com.example.java26.homework2.controller;

import com.example.java26.homework2.exception.ResourceNotFoundException;
import com.example.java26.homework2.pojo.dto.StudentResponseDTO;
import com.example.java26.homework2.service.StudentService;
import com.example.java26.homework2.pojo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<StudentResponseDTO> getEmp(@RequestParam(required = false) String name) {
        return new ResponseEntity<>(service.getAllStu(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO.StudentDTO> getEmpById(@PathVariable String id) {
        return new ResponseEntity<>(service.getStuById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> getEmp(@RequestBody Student student) {
        return new ResponseEntity<>("1", HttpStatus.OK);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleException() {
        return new ResponseEntity<>("xxx not found", HttpStatus.NOT_FOUND);
    }
}
