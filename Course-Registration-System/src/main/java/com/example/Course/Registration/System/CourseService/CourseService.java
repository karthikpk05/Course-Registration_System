package com.example.Course.Registration.System.CourseService;

import com.example.Course.Registration.System.CourseRepository.CourseRepository;
import com.example.Course.Registration.System.CourseRepository.StudentRegistrationRepository;
import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.StudentRegistration;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepo;
    private final StudentRegistrationRepository registrationRepo;

    public CourseService(CourseRepository courseRepo, StudentRegistrationRepository registrationRepo) {
        this.courseRepo = courseRepo;
        this.registrationRepo = registrationRepo;
    }

    // Courses
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    // Student Registration
    public StudentRegistration registerStudent(String name, String email, Long courseId) {
        Course course = courseRepo.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + courseId));

        StudentRegistration registration = new StudentRegistration();
        registration.setName(name);
        registration.setEmail(email);
        registration.setCourse(course);

        return registrationRepo.save(registration);
    }

    public List<StudentRegistration> getAllRegistrations() {
        return registrationRepo.findAll();
    }
}
