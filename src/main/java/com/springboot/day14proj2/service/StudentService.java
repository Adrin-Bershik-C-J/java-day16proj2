package com.springboot.day14proj2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.day14proj2.dto.StudentResponseDTO;
import com.springboot.day14proj2.mapper.StudentMapper;
import com.springboot.day14proj2.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public List<StudentResponseDTO> getStudents(String name, Integer age, String roomType, Boolean feePaid) {
        return studentRepository.findAll().stream()
                .filter(student -> name == null || student.getName().equalsIgnoreCase(name))
                .filter(student -> age == null || student.getAge() == age)
                .filter(student -> roomType == null || student.getRoomType().equalsIgnoreCase(roomType))
                .filter(student -> feePaid == null || student.getFeePaid() == true)
                .map(studentMapper::toDto)
                .collect(Collectors.toList());
    }

}
