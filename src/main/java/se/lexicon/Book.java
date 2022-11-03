package se.lexicon;
import java.util.ArrayList;
public class Book {
    // Fields
    private String title;
    private String author;
    private boolean available;
    private int bookId;
    private Person borrower;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle()
    {
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
    }

    public boolean isAvailable() {
        return this.available;
    }

    public int getBookId()
    {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Person getBorrower() {
        return borrower;
    }

    public ArrayList<Book> booklist = new ArrayList<Book>();

    public Book()
    {

    }

    //constructor
    public Book(int bookId, String title,String author,boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
        this.bookId = bookId;
    }

    public void addBook(Book book)
    {
        booklist.add(book);
    }

    public ArrayList<Book> showBooks()
    {
        return booklist;
    }

    public Person showPerson(int bookId, ArrayList<Book> availableBooks){
        Person person = new Person();
        for (int i = 0; i < availableBooks.size(); i++)
        {
            if(availableBooks.get(i).getBookId() == bookId)
            {
                return availableBooks.get(i).getBorrower();
            }
        }
        return person;
    }
    }




