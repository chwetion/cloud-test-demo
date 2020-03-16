package com.foxmail.chwetion.cloudtestdemo.serviceimpl;

import com.foxmail.chwetion.cloudtestdemo.bean.BeanBook;
import com.foxmail.chwetion.cloudtestdemo.bean.BeanBookExample;
import com.foxmail.chwetion.cloudtestdemo.dao.BeanBookMapper;
import com.foxmail.chwetion.cloudtestdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BeanBookMapper beanBookMapper;

    @Override
    public void add(String bookName, double price, int store) {
        BeanBook beanBook = new BeanBook();
        beanBook.setBookName(bookName);
        beanBook.setPrice(price);
        beanBook.setStore(store);
        beanBookMapper.insert(beanBook);
    }

    @Override
    public List<BeanBook> query(String bookName) {
        BeanBookExample bookExample = new BeanBookExample();
        bookExample.createCriteria().andBookNameLike("%" + bookName + "%");
        return beanBookMapper.selectByExample(bookExample);
    }

    @Override
    public List<BeanBook> query() {
        return beanBookMapper.selectByExample(new BeanBookExample());
    }

    @Override
    public List<BeanBook> query(int number) {
        BeanBookExample bookExample = new BeanBookExample();
        bookExample.setOrderByClause("price asc limit 0, " + number);
        return beanBookMapper.selectByExample(bookExample);
    }
}
