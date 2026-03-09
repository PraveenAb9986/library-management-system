package data;
import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class Patron implements Observer{
    private String id;
    private String name;
    private List<Loan> borrowingHistory;

    public Patron(String id, String name){
        this.id = id;
        this.name=name;
        this.borrowingHistory = new ArrayList<>();
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addLoan(Loan loan){
        borrowingHistory.add(loan);
    }

    public List<Loan> getborrowingHistory(){
        return this.borrowingHistory;
    }

    @Override
    public void update(String message){
        System.out.println(name + message);
    }
}
