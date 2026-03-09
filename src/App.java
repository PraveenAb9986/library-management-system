import data.Book;
import data.Patron;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // create book using factory
        Book book = BookFactory.createBook(
                "Clean Code",
                "Robert Martin",
                "111",
                2008
        );

        library.addBook(book);

        Patron patron1 = new Patron("P1","Alice");
        Patron patron2 = new Patron("P2","Bob");

        library.registerPatron(patron1);
        library.registerPatron(patron2);

        System.out.println("---- Alice borrows the book ----");

        library.checkoutBook("111","P1");

        System.out.println("---- Bob tries to borrow the book ----");

        library.checkoutBook("111","P2");

        System.out.println("---- Book returned ----");

        library.returnBook("111");
    }
}
