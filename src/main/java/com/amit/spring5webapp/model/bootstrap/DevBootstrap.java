package com.amit.spring5webapp.model.bootstrap;

import com.amit.spring5webapp.model.Author;
import com.amit.spring5webapp.model.Book;
import com.amit.spring5webapp.model.Publisher;
import com.amit.spring5webapp.model.repositories.AuthorRepository;
import com.amit.spring5webapp.model.repositories.BookRepository;
import com.amit.spring5webapp.model.repositories.PublisherRepository;
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
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){

        //Chetan
        Author chetan = new Author("Chetan", "Bhagat");
        Publisher peng = new Publisher("Penguin", "India");
        Book fps = new Book("Five Point Someone", "2345", peng);
        chetan.getBooks().add(fps);
        fps.getAuthors().add(chetan);

        publisherRepository.save(peng);
        authorRepository.save(chetan);
        bookRepository.save(fps);


        //robin
        Author robin = new Author("Robin", "Sharma");
        Publisher harper = new Publisher("Harper Collins", "USA");
        Book monk = new Book("The Monk Who Sold His Ferrari", "1234", harper);
        robin.getBooks().add(monk);
        monk.getAuthors().add(robin);

        publisherRepository.save(harper);
        authorRepository.save(robin);
        bookRepository.save(monk);

    }
}
