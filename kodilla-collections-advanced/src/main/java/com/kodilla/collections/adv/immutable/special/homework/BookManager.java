package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {

    static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author) {
        for (Book book : books)
            if (title.equals(book.getTitle()) && author.equals(book.getAuthor())) {
                return book;
            }

        Book book = new Book(title, author);
        books.add(book);

        return book;
    }




}


