create database cloud_test_demo;

use cloud_test_demo;

create table bean_book
(
    book_id   int auto_increment,
    book_name varchar(255) not null,
    price     double       not null,
    store     int          not null,
    constraint table_name_pk
        primary key (book_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;