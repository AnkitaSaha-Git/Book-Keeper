package com.example.Student_Library_Management_System.ResponseDTO;

import java.util.List;

public class AuthorResponseDTO {

    private int age;
    private String name;
    private double rating;
    private String country;

    List<BookResponseDTO> booksWrittenDTO;

    public AuthorResponseDTO() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<BookResponseDTO> getBooksWrittenDTO() {
        return booksWrittenDTO;
    }

    public void setBooksWrittenDTO(List<BookResponseDTO> booksWrittenDTO) {
        this.booksWrittenDTO = booksWrittenDTO;
    }
}
