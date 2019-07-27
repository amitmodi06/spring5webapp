package com.amit.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

/**
 * created by KUAM on 7/27/2019
 */
public class Book {

    private String title;
    private String isbn;
    private String publisher;

    private Set<Author> authors = new HashSet<>();

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
