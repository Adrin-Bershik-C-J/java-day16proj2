package com.springboot.day14proj2.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.day14proj2.dto.StudentResponseDTO;
import com.springboot.day14proj2.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentResponseDTO>> getStudents(@RequestParam(required = false) Long id,
            @RequestParam(required = false) String name, @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String roomType, @RequestParam(required = false) Boolean feePaid) {
        List<StudentResponseDTO> students = studentService.getStudents(name, age, roomType, feePaid);
        return ResponseEntity.ok(students);
    }
}
