import java.util.Scanner;
class Student{
    String name;
    int roll_no, marks;
    
    Student(String name, int roll_no, int marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    private String grade_calc(){
        String grade = null;
        if(marks >89 && marks <= 100){
            grade = "O";
        }
        else if(marks>79 && marks <90){
            grade = "A+";
        }
        else if(marks>69 && marks<80){
            grade = "A";
        }
        else if(marks>59 && marks<70){
            grade = "B+";
        }
        else if(marks > 49 && marks<60){
            grade = "B";
        }
        else if(marks>0 && marks<50){
            grade = "C";
        }
        else{
            return "Invalid";
        }
        return grade;

    }
    void display(){
        String grade = grade_calc();
        System.out.println("Name: "+name);
        System.out.println("roll_no: "+roll_no);
        System.out.println("mark: "+marks);
        System.out.println("grade: "+grade);
    }
}
public class pb6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int roll_no, marks;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("enter your roll_num: ");
        roll_no = input.nextInt();
        System.out.println("enter your marks: ");
        marks = input.nextInt();
        Student std1 = new Student(name, roll_no, marks);
        std1.display();
    }
}
