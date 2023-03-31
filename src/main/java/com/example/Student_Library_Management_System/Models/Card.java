package com.example.Student_Library_Management_System.Models;


import com.example.Student_Library_Management_System.Enum.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
public class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp //Auto time stamp when an entry is created
    private Date createdOn;

    @UpdateTimestamp // Sets time stamp when an entry is updated
    private Date updatedOn;

    @Enumerated(value= EnumType.STRING)
    //The "@Enumerated" annotation indicates that the enum type should be mapped
    // to the database as a string. The "value = EnumType.STRING" part specifies
    // that the enum values should be stored in the database as strings
    private CardStatus cardStatus;

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    //Card is child wrt Student
    @OneToOne
    @JoinColumn
    private Student studentVariableName; // This variable is used in the parent class
    // while doing bidirectional mapping


    // Card is parent wrt to Book
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Book> booksIssued= new ArrayList<>();



    public List<Book> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(List<Book> booksIssued) {
        this.booksIssued = booksIssued;
    }

    public List<Transaction> getTransactionList() {
        return TransactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        TransactionList = transactionList;
    }

    //Card is parent wrt to transaction
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    private List<Transaction> TransactionList= new ArrayList<>();
    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
