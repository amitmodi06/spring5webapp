package com.amit.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

/**
 * created by KUAM on 7/27/2019
 */
public class Author {

    private String firstName;
    private String lastName;

    private Set<Book> books= new HashSet<>();

    public Author(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
