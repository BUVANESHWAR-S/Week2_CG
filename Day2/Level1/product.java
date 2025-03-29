public class product {
    public static double discount = 0.0; // here we are using public because it needs to updated

    public static void update_disc(double newDiscount){
        discount = newDiscount;
    }
    private String ProductName;
    private int price, quanitity;
    private final int productId;
    
    // public void ds(){
    //     System.out.println(ProductName);
    // }
    public product(String product_name, int price, int quanitity, int productId){
        this.ProductName = product_name;
        this.price = price;
        this.quanitity = quanitity;
        this.productId = productId;
    }
    public void display(){
        if(this instanceof product){
            System.out.println("Product Name: "+ProductName);
            System.out.println("Product ID: "+productId);
            System.out.println("Quantity: "+quanitity);
            System.out.println("Price: "+price);
        }
    }
    public static void main(String[] args) {
        product pd1 = new product("chocolate", 10, 2, 20);
        // pd1.ds();
        pd1.display();
        pd1.update_disc(120);

    }

}
