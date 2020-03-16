package com.foxmail.chwetion.cloudtestdemo.service;

import com.foxmail.chwetion.cloudtestdemo.bean.BeanBook;

import java.util.List;

public interface BookService {
    void add(String bookName, double price, int store);

    List<BeanBook> query(String bookName);

    List<BeanBook> query();

    List<BeanBook> query(int number);
}
