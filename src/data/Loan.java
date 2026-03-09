package data;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Patron patron;
    private LocalDate checkoutDate;
    private LocalDate returnDate;

    public Loan(Book book,Patron patron){
        this.book = book;
        this.patron = patron;
        this.checkoutDate = LocalDate.now();
    }

    public Book getBook(){
        return this.book;
    }

    public void returnBook(){
        this.returnDate = LocalDate.now();
        book.returnBook();
    }
}
