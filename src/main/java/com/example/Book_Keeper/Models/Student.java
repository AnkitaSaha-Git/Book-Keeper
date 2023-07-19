package com.example.Book_Keeper.Models;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobNo;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(unique = true)
    private String email;
    private String country;

    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private Card card;

    public Student() {
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
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

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
