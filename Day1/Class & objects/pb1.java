import java.util.Scanner;

class Employee {
    String name;
    int id, salary;

    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display(){
        System.out.printf("Name: %s\nid: %d\nsalary: %d",name, id,salary);
    }
    
}
public class pb1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int id, salary;
        System.out.println("Enter your name: ");
        name = input.next();
        System.out.println("enter your id: ");
        id = input.nextInt();
        System.out.println("enter your salary");
        salary = input.nextInt();
        Employee emp1 = new Employee(name, id, salary);
        emp1.display();
    }
     
}