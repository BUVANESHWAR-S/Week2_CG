import java.util.*;
public class book {
    private static String library_name = "R library";
    private String title, author;
    private final long isbn;

    public book(String title, String author, long isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public static void libraryName(){
        System.out.println("Library Name: "+library_name);
    }

    public void display(){
        if(this instanceof book){
            System.out.println("title: "+title);
            System.out.println("author: "+author);
            System.out.println("isbn: "+isbn);
        }
        else{
            System.out.println("Invalid Object");
        }
    }
    public static void main(String[] args) {
        book bk1 = new book("harry potter", "jk rowling", 12334);
        bk1.display();
        book.libraryName();
    }
}
