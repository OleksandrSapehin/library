package com.example.crud.Models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "The title of the book should not be empty")
    @Size(min = 2, max = 100, message = "The title of the book should be between 2 and 100 characters long")
    private String title;

    @NotEmpty(message = "An author should not be empty")
    @Size(min = 2, max = 100, message = "The author's name should be between 2 and 100 characters long")
    private String author;

    @Min(value = 1500, message = "The year must be more than 1500")
    private int year;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
