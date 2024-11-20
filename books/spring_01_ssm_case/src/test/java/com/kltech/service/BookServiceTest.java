package com.kltech.service;

import com.kltech.config.SpringConfig;
import com.kltech.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testBookServiceSave(){
        Book book = new Book();
        book.setType("软件开发2");
        book.setName("springIoc2");
        book.setDescription("springIoc入门教程2");
        bookService.save(book);
    }

    @Test
    public void testBookServiceUpdate(){
        Book book = new Book();
        book.setId(15);
        book.setType("软件开发2");
        book.setName("springIoc2");
        book.setDescription("springIoc入门教程2");
        bookService.update(book);
    }

    @Test
    public void testBookServiceDelete(){
        bookService.delete(15);
    }

    @Test
    public void testBookServiceGetAll(){
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }

    @Test
    public void testBookServiceGetById(){
        Book book = bookService.getById(17);
        System.out.println(book);
    }

}
