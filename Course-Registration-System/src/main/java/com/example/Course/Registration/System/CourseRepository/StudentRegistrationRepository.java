package com.example.Course.Registration.System.CourseRepository;

import com.example.Course.Registration.System.Model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Long> {}
