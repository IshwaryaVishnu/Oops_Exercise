package se.lexicon;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Ponniyin Selvan", "kalki");
        Book book2 = new Book(2, "ramayan", "valmigi");

        Person ishu = new Person(2, "ishu", "sankar");

        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println("-----------------------");
        ishu.loanBook(book1);

        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println("-----------------------");

        ishu.loanBook(book2);

        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());

    }
}
