package com.bookstore.backend.Services;

import com.bookstore.backend.Models.Book;
import com.bookstore.backend.Repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService{

    private static final Logger logger = LoggerFactory.getLogger(BookService.class);


    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        logger.info("Getting all books");
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id){
        logger.info("Getting book by id {}", id);
        return bookRepository.findById(id);
    }

    public Book addBook(Book book){
        logger.info("Adding book {}", book.getTitle());
        return bookRepository.save(book);
    }

}
