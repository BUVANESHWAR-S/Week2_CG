class patient{
    static String hospitalName="SRMIST HOSPITAL";

     

    final String name;
    String ailment;
    int age;

    public patient(String name,String ailment,int age){
        this.name=name;
        this.ailment=ailment;
        this.age=age;
    }
    public void displayDetails(){
        System.out.println("name "+name);
        System.out.println("ailment "+ailment);
        System.out.println("age "+age);
    }
    public static void identity(int id){
        System.out.println("id "+id);
    }
    public static void hName(){
        System.out.println("hospital aname "+hospitalName);
    }
}
public class Hospital{
    public static void main(String[] args) {
        patient obj = new patient("bhuvi", "fever", 23);
        patient.hName();
        System.out.println();
         
        obj.displayDetails();
        
       
    }
}