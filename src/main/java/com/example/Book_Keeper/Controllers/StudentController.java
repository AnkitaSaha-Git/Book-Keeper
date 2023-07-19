package com.example.Book_Keeper.Controllers;


import com.example.Book_Keeper.DTOs.StudentUpdateMobNoDTO;
import com.example.Book_Keeper.Models.Student;
import com.example.Book_Keeper.Services.StudentService;
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
