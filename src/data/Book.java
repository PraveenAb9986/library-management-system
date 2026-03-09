package data;

import observer.Observer;
import observer.Subject;
import java.util.*;

public class Book implements Subject{
  private String title;
  private String author;
  private String isbn;
  private int publidcationYear;
  private boolean available;

  private List<Observer> observers = new ArrayList<>();

  public Book(String title,String author, String isbn,int publidcationYear, boolean available){
     this.title =  title;
     this.author = author;
     this.isbn = isbn;
     this.publidcationYear = publidcationYear;
     this.available=true;
  }

  public String getTitle(){
    return this.title;
  }

  public String getauthor(){
    return this.author;
  }

  public String getIsnb(){
    return this.isbn;
  }

  public int getpublidcationYear(){
    return this.publidcationYear;
  }

  public void borrowBook(){
    this.available = false;
  }

  public void returnBook(){
     this.available= true;
     notifyObervers();
  }

  public boolean isAvailble(){
    return this.available;
  }


  @Override
  public void addObserver(Observer observer){
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer){
    observers.remove(observer);
  }

  @Override
  public void notifyObervers(){
     for(Observer observer:observers){
        observer.update(author);
     }
  }
}