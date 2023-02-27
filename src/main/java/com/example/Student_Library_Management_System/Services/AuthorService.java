package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.DTOs.AuthorEntryDTO;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Repositories.AuthorRepository;
import com.example.Student_Library_Management_System.ResponseDTO.AuthorResponseDTO;
import com.example.Student_Library_Management_System.ResponseDTO.BookResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public AuthorResponseDTO getAuthor(int authorId){
        Author author= authorRepository.findById(authorId).get();
        AuthorResponseDTO authorResponseDTO= new AuthorResponseDTO();

        List<Book> bookList= author.getBooksWritten();
        List<BookResponseDTO> booksWrittenDTO = new ArrayList<>();

        for(Book b: bookList){
            BookResponseDTO bookResponseDTO=new BookResponseDTO();
            bookResponseDTO.setGenre(b.getGenre());
            bookResponseDTO.setPages(b.getPages());
            bookResponseDTO.setName(b.getName());

            booksWrittenDTO.add(bookResponseDTO);
        }
        authorResponseDTO.setBooksWrittenDTO(booksWrittenDTO);
        authorResponseDTO.setAge(author.getAge());
        authorResponseDTO.setCountry(author.getCountry());
        authorResponseDTO.setRating(author.getRating());
        authorResponseDTO.setName(author.getName());

        return authorResponseDTO;



    }
}
