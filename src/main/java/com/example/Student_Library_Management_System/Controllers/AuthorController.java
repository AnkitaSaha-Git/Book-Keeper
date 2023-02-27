package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.DTOs.AuthorEntryDTO;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.ResponseDTO.AuthorResponseDTO;
import com.example.Student_Library_Management_System.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String createAuthor(@RequestBody AuthorEntryDTO author){
        return authorService.createAuthor(author);
    }

    @GetMapping("/getAuthor")
    public AuthorResponseDTO getAuthor(@RequestParam("authorId") int authorId){
        return authorService.getAuthor(authorId);
    }
}
