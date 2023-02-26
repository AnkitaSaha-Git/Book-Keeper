package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.DTOs.AuthorEntryDTO;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorEntryDTO authorEntryDTO){

        Author author= new Author();
        author.setAge(authorEntryDTO.getAge());
        author.setCountry(authorEntryDTO.getCountry());
        author.setName(authorEntryDTO.getName());
        author.setRating(authorEntryDTO.getRating());

        authorRepository.save(author);
        return "Author added successfully";
    }
}
