package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {

    public static void main(String[] args) {

        Book coben = BookManager.createBook("The Stranger", "Harlan Coben");
        Book rowling = BookManager.createBook("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling");
        Book tolkien = BookManager.createBook("The Lord of the Ring", "J.R.R. Tolkien");
        Book coben2 = BookManager.createBook("The Stranger", "Harlan Coben");



        System.out.println(coben.getTitle() + " " + coben.getAuthor());
        System.out.println(rowling.getTitle() + " " + rowling.getAuthor());
        System.out.println(tolkien.getTitle() + " " + tolkien.getAuthor());
        System.out.println("---------------");
        System.out.println(coben == rowling);
        System.out.println(coben == tolkien);
        System.out.println(rowling == tolkien);
        System.out.println(coben.getAuthor() == coben2.getAuthor());
        System.out.println(coben.getAuthor().equals(coben2.getAuthor()));
        System.out.println("---------------");
        System.out.println(coben == coben2);


    }
}
