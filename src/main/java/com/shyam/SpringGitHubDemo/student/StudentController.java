package com.shyam.SpringGitHubDemo.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


   // @GetMapping
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

    @PostMapping
    public  Student save(
            @RequestBody Student student
    ){
        return  studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable String email){
        return  studentService.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PutMapping
    public  Student updateStudent(
            @RequestBody Student student
    ) {
        return  studentService.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
          @PathVariable String email
    ){
        studentService.delete(email);
    }
}
