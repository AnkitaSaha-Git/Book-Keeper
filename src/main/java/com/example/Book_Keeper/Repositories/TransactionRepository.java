package com.example.Book_Keeper.Repositories;

import com.example.Book_Keeper.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

      @Query(value = "select * from transactions t where t.book_id=:bookId and t.card_id=:cardId and is_issue_operation=true",nativeQuery = true)
      List<Transaction> getTransactionsForBookAndCard(int bookId, int cardId);

}
