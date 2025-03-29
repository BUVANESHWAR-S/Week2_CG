import java.util.Scanner;
class MobilePhone{
    private String Model, brand;
    private int price;

    public MobilePhone(String Model, String brand, int price){
        this.Model = Model;
        this.brand = brand;
        this.price = price;
    }

    public void display(){
        System.out.println("Model: "+Model);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}
public class pb5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Model, brand;
        int price;
        System.out.println("Enter a Model name: ");
        Model = input.nextLine();
        System.out.println("Enter a brand name: ");
        brand = input.nextLine();
        System.out.println("Enter the price: ");
        price = input.nextInt();

        MobilePhone mb1 = new MobilePhone(Model, brand, price);
        mb1.display();
        
    }
}
