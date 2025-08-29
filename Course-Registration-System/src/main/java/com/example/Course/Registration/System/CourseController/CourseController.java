package com.example.Course.Registration.System.CourseController;

import com.example.Course.Registration.System.CourseService.CourseService;
import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.StudentRegistration;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    // Courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    // Student Registration
    @PostMapping("/registrations")
    public StudentRegistration registerStudent(@RequestBody Map<String, Object> payload) {
        String name = (String) payload.get("name");
        String email = (String) payload.get("email");
        Integer courseIdInt = (Integer) payload.get("courseId");
        Long courseId = courseIdInt != null ? courseIdInt.longValue() : null;

        return service.registerStudent(name, email, courseId);
    }

    @GetMapping("/registrations")
    public List<StudentRegistration> getAllRegistrations() {
        return service.getAllRegistrations();
    }
}
