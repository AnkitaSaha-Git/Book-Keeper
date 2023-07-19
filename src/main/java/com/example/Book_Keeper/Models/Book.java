package com.example.Book_Keeper.Models;

import com.example.Book_Keeper.Enum.Genre;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="_book_")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int pages;

    private boolean issued;

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Enumerated(value=EnumType.STRING)
    private Genre genre;

    //Book is child wrt to author
    // Setting here the foreign key: Standard 3 steps

    @ManyToOne
    @JoinColumn
    private Author author; // parent entity we are connecting



    // Book is also child wrt to card
    @ManyToOne
    @JoinColumn
    private Card card;


    //Book is parent wrt to transaction
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    private List<Transaction> listOfTransactions= new ArrayList<>();

    public List<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }

    public void setListOfTransactions(List<Transaction> listOfTransactions) {
        this.listOfTransactions = listOfTransactions;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
