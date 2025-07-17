package com.tamji.lab.cpe.cpen252;

public class Book {
    String title;
    String author;
    String genre;
    int numberOfPages;

    void open(){
        System.out.println("Opened " + title);
    };
    void close(){
        System.out.println("Book Closed");
    };
    void read(int page){
        if (page > numberOfPages){
            close();
        } else {
            System.out.println("Reading on page " + page + " of " + numberOfPages);
        }
    }
}
