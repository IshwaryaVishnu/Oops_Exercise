package se.lexicon;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book();
        book.addBook(new Book( 1, "Ponniyin Selvan", "kalki", true));
        book.addBook(new Book( 2 ,"ramayan", "valmigi", true));


        ArrayList<Book> Books = book.showBooks();

        Person person = new Person();
        Person ishu = new Person(2,"ishu", "sankar");
        person.loanBook(2, ishu, Books);
        Person swetha = new Person(3,"swetha","sree");
        person.loanBook( 2, swetha,Books);

        for (int i = 0; i < Books.size(); i++)
        {
            System.out.println(Books.get(i).getTitle());
        }

        System.out.println(book.showPerson(1, Books).getFirstName());
    }
}
