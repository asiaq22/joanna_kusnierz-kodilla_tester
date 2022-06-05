package com.kodilla.collections.adv.immutable.special.homework;

public class Book {

    private final String title;
    private final String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public final String getTitle() {

        return title;
    }

    public final String getAuthor() {

        return author;
    }


}
