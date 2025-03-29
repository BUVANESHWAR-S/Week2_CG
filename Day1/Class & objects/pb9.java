import java.util.Scanner;
class MovieTicket{
    String MovieName;
    String SeatNumber;
    double price;
    public MovieTicket(String MovieName){
        this.MovieName = MovieName;
        this.SeatNumber = "Not Assigned";
        this.price = 0.0;
    }
    public void book_ticket(String SeatNumber, double price){
        this.SeatNumber = SeatNumber;
        this.price = price;
        System.out.println("ticket booked successfully for "+MovieName);
    }
    public void display_ticket(){
        System.out.println("Movie Name: "+MovieName);
        System.out.println("Seat number: "+SeatNumber);
        System.out.println("Price: "+price);
    }
}
public class pb9 {
    public static void main(String[] args) {
        MovieTicket mv = new MovieTicket("Doomsday");
        mv.book_ticket("A12", 150);
        mv.display_ticket();
    }
}
