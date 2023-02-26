package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.DTOs.IssueBookRequestDTO;
import com.example.Student_Library_Management_System.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/issuebook")
    public String issueBook(IssueBookRequestDTO issueBookRequestDTO){
        return transactionService.issueBook(issueBookRequestDTO);
    }

}
