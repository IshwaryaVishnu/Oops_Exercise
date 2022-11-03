package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    // Instance variables
    private int personId;
    private String firstName;
    private String lastName;

    private Book[] borrowedBooks = new Book[0];


    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void loanBook(Book book) {
        if(book.isAvailable()){
            book.setBorrower(this);
            Book[] newArray = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
            newArray[newArray.length -1] = book;

            borrowedBooks = newArray;
        } else {
            System.out.println("book is not available");
        }


    }

    public String displayBooks() {
        return null;
    }


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


}




