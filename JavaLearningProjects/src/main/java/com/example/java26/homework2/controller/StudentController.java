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
    public ResponseEntity<StudentResponseDTO> getStu(@RequestParam(required = false) String name) {
        return new ResponseEntity<>(service.getAllStu(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO.StudentDTO> getStuById(@PathVariable String id) {
        return new ResponseEntity<>(service.getStuById(id), HttpStatus.OK);
    }


    @RequestMapping(value = "/add/{name}/{age}/{gender}/{gpa}")
    public ResponseEntity<Student> addStu(@PathVariable String name,
                           @PathVariable int age,
                           @PathVariable String gender,
                           @PathVariable double gpa)
    {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setGpa(gpa);
        return new ResponseEntity<>(service.createStu(student),HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{id}/{name}/{age}/{gender}/{gpa}")
    public ResponseEntity<Student> updateStu(@PathVariable String id,
                                          @PathVariable String name,
                                          @PathVariable int age,
                                          @PathVariable String gender,
                                          @PathVariable double gpa)
    {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setGpa(gpa);
        return new ResponseEntity<>(service.updateStu(student),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable String id)
    {
        service.deleteStuById(id);
    }

}
