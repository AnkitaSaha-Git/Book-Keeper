package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.DTOs.BookEntryDTO;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Repositories.AuthorRepository;
import com.example.Student_Library_Management_System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    public String addBook(BookEntryDTO bookEntryDTO){


        //I want to get the author Entity
        int authorId=bookEntryDTO.getAuthorId();

        //Now I will be fetching the author entity
        Author author= authorRepository.findById(authorId).get();

        Book book= new Book();
        book.setName(bookEntryDTO.getName());
        book.setGenre(bookEntryDTO.getGenre());
        book.setPages(bookEntryDTO.getPages());
        book.setIssued(false);

        // Do exception handling for getting author

        // basic attributes are already set from postman

        // Setting the foreign key attribute in child class.
        book.setAuthor(author);

        //Now the book is to be saved, but author is also to be saved.

        // Why do we need to again save (updating) the author?? Bcz
        // bcz the author entity has been updated .....we need to resave/update it.

        List<Book> currentBooksWritten= author.getBooksWritten();
        currentBooksWritten.add(book);

        authorRepository.save(author);

        return "Book added successfully";

    }
}
