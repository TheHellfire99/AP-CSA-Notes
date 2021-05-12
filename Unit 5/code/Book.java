// Programmer: Shaurya Srivastav
// Date: 5/10/21
// Purpose: to demonstrate data encapsulation

public class Book {
    private String title; //private instance variables
    private String genre; 
    private String author; 
    private int numPages; 

    public Book(){//default constructor
        title = ""; 
        genre = ""; 
        author = ""; 
        numPages = 0; 
    }

    public Book(String t,String g, String a, int np){ //overloaded constructor 
        title = t; 
        genre = g; 
        author = a; 
        numPages = np; 
    }
}
