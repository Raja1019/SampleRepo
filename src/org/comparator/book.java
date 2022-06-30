package org.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class book implements Comparable<book>{

     long bookId;
     String bookName;
     String authorName;
     double price;
     long isbn;
    
    
    public book() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    public book(long bookId, String bookName, String authorName, double price, long isbn) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.isbn = isbn;
    }

    

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
                + ", isbn=" + isbn + "]";
    }



    public int compareTo(book o) {
        
        if(this.price==o.price)         
         return 0;
        else if(this.price<o.price)
         return 1;
        else
         return -1; 
    }
    public static void main(String[] args) {
        
        List<book> books=new ArrayList<book>();
        
        books.add(new book(101,"ABC","A.Roy",340.00,324234324));
        books.add(new book(102,"PQR","K.Kumar",320.00,564645645));
        books.add(new book(103,"XYZ","L.Sharma",350.00,324324324));
        books.add(new book(104,"LKG","K.Roy",540.00,12232321));
        
        System.out.println("Before the sorting...");
        for(book book:books)
        {
            System.out.println(book);
        }
        
        
        Collections.sort(books);
        
        
        System.out.println("After the sorting...");
        for(book book:books)
        {
            System.out.println(book);
        }
        

    }


    

}