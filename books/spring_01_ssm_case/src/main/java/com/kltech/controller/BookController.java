package com.kltech.controller;

import com.kltech.common.Code;
import com.kltech.common.Result;
import com.kltech.domain.Book;
import com.kltech.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        boolean flag = books !=null?true:false;
        return new Result(flag? Code.GET_OK:Code.GET_ERR,books);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        boolean flag = book !=null?true:false;
        return new Result(flag? Code.GET_OK:Code.GET_ERR,book);
    }

}
