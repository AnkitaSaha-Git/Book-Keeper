package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.DTOs.StudentUpdateMobNoDTO;
import com.example.Student_Library_Management_System.Models.Student;
import com.example.Student_Library_Management_System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }

    @GetMapping("/get")
    public String getNameByEmail(@RequestParam ("email") String email){
        return studentService.getNameByEmail(email);
    }

    @PutMapping("/update")
    public String updateMobNo(@RequestBody StudentUpdateMobNoDTO student){
        return studentService.updateMobNo(student);
    }
}
