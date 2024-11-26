package com.shyam.SpringGitHubDemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public  Student findByEmail(String email);
    public  void deleteByEmail(String email);
}
