package com.shyam.SpringGitHubDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service

public class InMemoryStudentService implements  StudentService{

    private  final  InMemoryStudentDao inMemoryStudentDao;

    public InMemoryStudentService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }

    @Override
    public List<Student> findAllStudents() {
//        return List.of(
//                new Student(
//                        "shyam",
//                        "Bhushan",
//                        LocalDate.now(),
//                        "shyam@gat.ac.in",
//                        30
//                ),
//                new Student(
//                        "Jyothi",
//                        "Bhushan",
//                        LocalDate.now(),
//                        "Jyothi@gat.ac.in",
//                        35
//                )
//        );

        return inMemoryStudentDao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return inMemoryStudentDao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return inMemoryStudentDao.update(s);
    }

    @Override
    public void delete(String email) {
      inMemoryStudentDao.delete(email);
    }
}
