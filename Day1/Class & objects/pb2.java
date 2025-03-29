import java.util.Scanner;
import java.lang.Math;
class Circle{
    private int radius; //by using private we can access attributes without using constructor
    void area(int radius){
        this.radius = radius;
        int area;
        area = (int)Math.pow(radius, 2);
        System.out.printf("area: %d",area);
    }
}
public class pb2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.println("Enter the radius: ");
        radius = input.nextInt();
        Circle cl1 = new Circle();
        cl1.area(radius);
    }
}
