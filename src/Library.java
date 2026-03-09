
import java.util.*;
import data.*;


public class Library {

    private Map<String, Book> books = new HashMap<>();
    private Map<String, Patron> patrons = new HashMap<>();
    private List<Loan> loans = new ArrayList<>();


    public void addBook(Book book){
        books.put(book.getIsnb(), book);
    };

    public void removeBook(Book book){
        books.remove(book);
    };

    public void registerPatron(Patron patron){
        patrons.put(patron.getId(), patron);
    };

    public void checkoutBook(String isbn, String patronId){
        Book book = books.get(isbn);
        Patron patron = patrons.get(patronId);

        if(book == null || patron == null){
            System.out.println("inavlid book id");
        }
        book.addObserver(patron);

        if(!book.isAvailble()){
            return;
        }

        Loan loan = new Loan(book, patron);
        book.borrowBook();
        patron.addLoan(loan);
        loans.add(loan);

    };

    public void returnBook(String isbn){
            for(Loan loan: loans){
                if(loan.getBook().getIsnb().equals(isbn)){
                    loan.returnBook();
                    return;
                }

            }
    }

    public List<Book> searchByTitle(String title){
        List<Book> bookList = new ArrayList<Book>();
        
        for (Book book : books.values()) {
            if(book.getTitle().equalsIgnoreCase(title)){
                bookList.add(book);
            }
        }
        return bookList;
    }
}
