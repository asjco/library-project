package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Year;

@Entity
@Table(name = "BOOKS_TITLES")
public class Titles {

    private int id;
    private String title;
    private String author;
    private Year yearOfPublication;

    public Titles() {
    }

    public Titles(int id, String title, String author, Year yearOfPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    @NotNull
    @Column(name = "AUTHOR")
    public String getAuthor() {
        return author;
    }

    @NotNull
    @Column(name = "YEAR_OF_PUBLICATION")
    public Year getYearOfPublication() {
        return yearOfPublication;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setYearOfPublication(Year yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
