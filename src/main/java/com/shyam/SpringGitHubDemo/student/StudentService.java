package com.shyam.SpringGitHubDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "shyam",
                        "Bhushan",
                        LocalDate.now(),
                        "shyam@gat.ac.in",
                        30
                ),
                new Student(
                        "Jyothi",
                        "Bhushan",
                        LocalDate.now(),
                        "Jyothi@gat.ac.in",
                        35
                )
        );
    }

}
