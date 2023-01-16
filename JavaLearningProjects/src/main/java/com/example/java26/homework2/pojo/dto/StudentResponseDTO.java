package com.example.java26.homework2.pojo.dto;

import com.example.java26.homework2.pojo.entity.Student;
import com.example.java26.week3.rest.demo1.pojo.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentResponseDTO {
    private List<StudentDTO> studentList;

    @Data
    @AllArgsConstructor
    @Builder
    public static class StudentDTO {
        private String id;
        private String name;
        private int age;
        private String gender;
        private double gpa;

        public StudentDTO (Student s) {
            this.id = s.getId();
            this.name = s.getName();
            this.age = s.getAge();
            this.gender = s.getGender();
            this.gpa = s.getGpa();
        }

    }
}