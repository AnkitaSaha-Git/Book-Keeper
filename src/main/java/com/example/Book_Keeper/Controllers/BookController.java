package com.example.Book_Keeper.Controllers;


import com.example.Book_Keeper.DTOs.BookEntryDTO;
import com.example.Book_Keeper.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add")
    public String addBook(@RequestBody BookEntryDTO bookEntryDTO){
        return bookService.addBook(bookEntryDTO);
    }
}
