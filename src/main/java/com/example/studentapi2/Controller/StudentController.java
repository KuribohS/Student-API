package com.example.studentapi2.Controller;

import com.example.studentapi2.Entity.StudentEntity;
import com.example.studentapi2.Repository.StudentRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    private StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @GetMapping("api/student")
    public List<StudentEntity> index(){
        return studentRepo.findAll();
    }
}
