package com.shyam.SpringGitHubDemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
//    public List<String> findAllStudents(){
//        return List.of("shyam", "Bhushan", "sundar","Bhushan");
//    }

//    public List<Student> findAllStudents(){
//        return List.of(
//                new Student(
//                        "shyam",
//                        "Bhushan",
//                        LocalDate.now(),
//                        "shyam@gat.ac.in",
//                        30
//                        ),
//                new Student(
//                        "Jyothi",
//                        "Bhushan",
//                        LocalDate.now(),
//                        "Jyothi@gat.ac.in",
//                        35
//                )
//        );
//    }

    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

}
