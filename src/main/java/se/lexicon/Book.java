package se.lexicon;

import java.util.ArrayList;

public class Book {
    // Fields
    private int bookId;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;


    //constructors
    public Book() {
        this.available = true;
    }

    public Book(int bookId, String title, String author) {
        this();
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }


    public String getBookInformation(){
        return bookId + " " + title + " " + available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = false;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public int getBookId() {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Person getBorrower() {
        return borrower;
    }


}




