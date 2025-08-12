package com.springboot.day14proj2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.day14proj2.entity.Student;
import com.springboot.day14proj2.repository.StudentRepository;

@SpringBootApplication
public class Day14proj2Application {

	public static void main(String[] args) {
		SpringApplication.run(Day14proj2Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(StudentRepository studentRepository) {
		return args -> {
			studentRepository.save(new Student(null, "Adrin", 21, "3 sharing", true));
			studentRepository.save(new Student(null, "Bershik", 21, "3 sharing", false));
			studentRepository.save(new Student(null, "Kane", 21, "2 sharing", true));
		};
	}
}
