package com.example.Student_Library_Management_System.Controllers;


import com.example.Student_Library_Management_System.DTOs.IssueBookRequestDTO;
import com.example.Student_Library_Management_System.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/issuebook")
    public String issueBook(@RequestBody IssueBookRequestDTO issueBookRequestDTO){
        try {
            return transactionService.issueBook(issueBookRequestDTO);
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/getTxnInfo")
    public String getTransactions(int bookId,int cardId){
        return transactionService.getTransactions(bookId, cardId);
    }

}
