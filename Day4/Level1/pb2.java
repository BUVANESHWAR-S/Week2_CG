import java.util.*;
class Employee{
    protected String name;
    protected int id, salary;

    protected void displayDetails(String name, int id, int salary){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    private int teamsize;

    @Override
    protected void displayDetails(String name, int id, int teamsize, int salary){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("TeamSize: "+teamsize);
        System.out.println("Salary: "+salary);
    }
}
// class Developer extends Employee{

// }
public class pb2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.displayDetails("Bhuvi", 124345, 28000);
    }
}
