package com.example.Book_Keeper.Controllers;


import com.example.Book_Keeper.DTOs.AuthorEntryDTO;
import com.example.Book_Keeper.ResponseDTO.AuthorResponseDTO;
import com.example.Book_Keeper.Services.AuthorService;
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
