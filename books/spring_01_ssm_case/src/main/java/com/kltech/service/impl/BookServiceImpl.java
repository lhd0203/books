package com.kltech.service.impl;

import com.kltech.dao.BookDao;
import com.kltech.domain.Book;
import com.kltech.service.BookService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {

        return bookDao.save(book)>0;
    }

    @Override
    public boolean update(Book book) {

        return bookDao.update(book)>0;
    }

    @Override
    public boolean delete(Integer id) {

        return bookDao.delete(id)>0;
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookDao.getAll();
        return books;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }
}
