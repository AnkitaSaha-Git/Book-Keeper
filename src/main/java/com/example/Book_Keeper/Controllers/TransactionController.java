package com.example.Book_Keeper.Controllers;


import com.example.Book_Keeper.DTOs.IssueBookRequestDTO;
import com.example.Book_Keeper.Services.TransactionService;
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
    public String getTransactions(@RequestParam ("bookId")int bookId,@RequestParam ("cardId")int cardId){
        return transactionService.getTransactions(bookId, cardId);
    }

}
