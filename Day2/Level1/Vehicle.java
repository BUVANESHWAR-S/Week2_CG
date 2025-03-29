public class Vehicle {
    static int registration_fee = 1000;

    public static void update_fee(int new_fee){
        registration_fee = new_fee;
        System.out.println("updated");
    }
    private String owner_name, vehicle_type;
    private final String reg_num;

    public Vehicle(String owner_name, String vehicle_type, String reg_num){
        this.owner_name = owner_name;
        this.vehicle_type = vehicle_type;
        this.reg_num = reg_num;
    }

    public void display(){
        if(this instanceof Vehicle){
            System.out.println("Ower Name: "+owner_name);
            System.out.println("Vehicle Type: "+vehicle_type);
            System.out.println("Registration Number: "+reg_num);
        }
        else{
            System.out.println("Invalid Object");
        }
    }
    public static void main(String[] args) {
        Vehicle vh1 = new Vehicle("Karun", "Tarzan", "TN61 2032");
        vh1.display();
        Vehicle.update_fee(2000);
    }
}
