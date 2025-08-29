# Course Registration System

## Description
The **Course Registration System** is a web-based application that allows students to register for courses, view available courses, and see enrolled students. It is built using **Spring Boot** for the backend, **JPA/Hibernate** for database management, and **HTML/CSS/JavaScript** for the frontend.  

This system stores all course and student registration data in a **MySQL database** and provides a simple interface for managing course enrollments.

---

## Features
- View available courses.
- Register for a course with student name and email.
- View enrolled students for each course.
- Data is stored and managed using MySQL.
- RESTful API endpoints to handle CRUD operations.
- Cross-Origin support for frontend and backend communication.

---

## Technologies Used
- **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate
- **Database:** MySQL
- **Frontend:** HTML, CSS, JavaScript
- **Build Tool:** Maven

---

## Backend Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/courses` | GET | Fetch all courses |
| `/api/courses` | POST | Add a new course |
| `/api/registrations` | POST | Register a student to a course |
| `/api/registrations` | GET | Fetch all registered students |

---

## Application Screenshots

### Available Courses
![Available Courses]("screenshots/Screenshot (211).png")

### Registration Form
![Registration Form]("screenshots/Screenshot (210).png")

### Enrolled Students
![Enrolled Students]("screenshots/Screenshot (213).png")

### Database

![Database]("screenshots/Screenshot (215).png")
