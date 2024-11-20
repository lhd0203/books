package com.kltech.service;

import com.kltech.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     *根据ID删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Book getById(Integer id);
}
