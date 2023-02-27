package com.example.Student_Library_Management_System.ResponseDTO;

import com.example.Student_Library_Management_System.Enum.Genre;

public class BookResponseDTO {

    private int pages;
    private String name;
    private Genre genre;

    public BookResponseDTO() {
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
