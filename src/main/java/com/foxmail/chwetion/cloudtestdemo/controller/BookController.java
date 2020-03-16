package com.foxmail.chwetion.cloudtestdemo.controller;

import com.foxmail.chwetion.cloudtestdemo.bean.BeanBook;
import com.foxmail.chwetion.cloudtestdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/add")
    @ResponseBody
    public String add(String bookName, double price, int store) {
        bookService.add(bookName, price, store);
        return "Insert book named " + bookName + " success, its price is $" + (double) Math.round(price * 100) / 100;
    }

    @GetMapping("/query/{name}")
    @ResponseBody
    public String query(@PathVariable String name) {
        List<BeanBook> beanBookList = bookService.query(name);
        StringBuilder sb = new StringBuilder("The book info as follow: <br>");
        for (BeanBook beanBook : beanBookList) {
            sb.append("name: ").append(beanBook.getBookName()).append("&emsp;price: $").append(beanBook.getPrice()).append("&emsp;store: ").append(beanBook.getStore()).append("<br>");
        }
        if (CollectionUtils.isEmpty(beanBookList)) {
            sb.append("no result");
        }
        return sb.toString();
    }

    @GetMapping("/query")
    @ResponseBody
    public String query() {
        List<BeanBook> beanBookList = bookService.query();
        StringBuilder sb = new StringBuilder("The book info as follow: <br>");
        for (BeanBook beanBook : beanBookList) {
            sb.append("name: ").append(beanBook.getBookName()).append("&emsp;price: $").append(beanBook.getPrice()).append("&emsp;store: ").append(beanBook.getStore()).append("<br>");
        }
        if (CollectionUtils.isEmpty(beanBookList)) {
            sb.append("no result");
        }
        return sb.toString();
    }

    @GetMapping("/querytop/{number}")
    @ResponseBody
    public String queryTop(@PathVariable int number) {
        List<BeanBook> beanBookList = bookService.query(number);
        StringBuilder sb = new StringBuilder("The book info as follow: <br>");
        for (BeanBook beanBook : beanBookList) {
            sb.append("name: ").append(beanBook.getBookName()).append("&emsp;price: $").append(beanBook.getPrice()).append("&emsp;store: ").append(beanBook.getStore()).append("<br>");
        }
        if (CollectionUtils.isEmpty(beanBookList)) {
            sb.append("no result");
        }
        return sb.toString();
    }
}
