package com.example.Course.Registration.System.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
