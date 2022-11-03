package se.lexicon;
import java.util.ArrayList;
public class Person {
    // Instance variables
    private int personId;
    private String firstName;
    private String lastName;
    public int getPersonId(){return personId;}
    public void setPersonId(int personId) {this.personId = personId;}
    public String getFirstName() {return firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getLastName() {return lastName;}

    public ArrayList<Person> personList = new ArrayList<Person>();
    public void addPerson(Person person)
    {
        personList.add(person);
    }
    public ArrayList<Person> showPersons()
    {
        return personList;
    }
    public Person() { }
    public Person(int personId,String firstName,String lastName){
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
      public void loanBook(int bookId, Person borrower, ArrayList<Book> availableBooks)
    {
        for (int i = 0; i < availableBooks.size(); i++)
        {
            if(availableBooks.get(i).getBookId() == bookId && availableBooks.get(i).isAvailable())
            {
                availableBooks.get(i).setBorrower(borrower);
                availableBooks.get(i).setAvailable(false);
            }
        }
    }

    public ArrayList<Book> displayBooks(Book book)
    {
        ArrayList<Book> books = book.showBooks();
        return books;
    }
}




