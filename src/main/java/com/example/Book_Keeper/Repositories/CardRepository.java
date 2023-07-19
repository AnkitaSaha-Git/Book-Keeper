package com.example.Book_Keeper.Repositories;

import com.example.Book_Keeper.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
