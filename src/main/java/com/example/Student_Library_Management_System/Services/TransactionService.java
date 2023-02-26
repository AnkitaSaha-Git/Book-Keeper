package com.example.Student_Library_Management_System.Services;


import com.example.Student_Library_Management_System.DTOs.IssueBookRequestDTO;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Repositories.BookRepository;
import com.example.Student_Library_Management_System.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {


    @Autowired
    TransactionRepository transactionRepository;
    public String issueBook(IssueBookRequestDTO issueBookRequestDTO){
       return "";

    }
}
