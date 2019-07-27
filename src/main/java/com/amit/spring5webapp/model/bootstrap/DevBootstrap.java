package com.amit.spring5webapp.model.bootstrap;

import com.amit.spring5webapp.model.Author;
import com.amit.spring5webapp.model.Book;
import com.amit.spring5webapp.model.repositories.AuthorRepository;
import com.amit.spring5webapp.model.repositories.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * created by KUAM on 7/27/2019
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){

        //Chetan
        Author chetan = new Author("Chetan", "Bhagat");
        Book fps = new Book("Five Point Someone", "2345", "Penguin ");
        chetan.getBooks().add(fps);
        fps.getAuthors().add(chetan);

        authorRepository.save(chetan);
        bookRepository.save(fps);

        //robin
        Author robin = new Author("Robin", "Sharma");
        Book monk = new Book("The Monk Who Sold His Ferrari", "1234", "Harper Collins");
        robin.getBooks().add(monk);
        monk.getAuthors().add(robin);

        authorRepository.save(robin);
        bookRepository.save(monk);
    }
}
