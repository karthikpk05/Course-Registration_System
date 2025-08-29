package com.example.Course.Registration.System;

import com.example.Course.Registration.System.CourseRepository.CourseRepository;
import com.example.Course.Registration.System.Model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseRegistrationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseRegistrationSystemApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CourseRepository courseRepo) {
		return args -> {
			if (courseRepo.count() == 0) {
				courseRepo.save(new Course(null, "Java Programming", "Learn Java from scratch"));
				courseRepo.save(new Course(null, "Python Basics", "Introduction to Python"));
				courseRepo.save(new Course(null, "Web Development", "HTML, CSS, JS"));
				courseRepo.save(new Course(null, "Data Science", "Data analysis and ML"));
			}
		};

	}
}
