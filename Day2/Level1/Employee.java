import java.util.*;
public class Employee {
    private static String Cmpny_Name = "Capgemini";
    private String name, designation;
    private final int ID;

    public Employee(String name, String designation, int ID){
        this.name = name;
        this.designation = designation;
        this.ID = ID;
    }
    public void display(){
        if(this instanceof Employee){
            System.out.println("Name: "+name);
            System.out.println("ID: "+ID);
            System.out.println("Designation: "+designation);
            System.out.println("Company Name: "+Cmpny_Name);
        }
        else{
            System.out.println("Invalid Object");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Karun DM", "Manager", 12424);
        emp1.display();
    }
}
