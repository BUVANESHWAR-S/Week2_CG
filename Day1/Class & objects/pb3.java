import java.util.Scanner;
class Book {
    private String title, author;
    private int price;
    void details(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d", title, author, price);

    }
}
public class pb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price;
        String title, author;
        System.out.println("enter the title of the book: ");
        title = input.nextLine();
        //input.nextLine();
        System.out.println("enter the author of the book: ");
        author = input.nextLine();
        //input.nextLine();
        System.out.println("enter the price of the book: ");
        price = input.nextInt();
        Book b1 = new Book();
        b1.details(title, author, price);

    }
}
