import java.util.Scanner;
class Item{
    int Item_code, Item_price;
    String  Item_name;
    private int quantity;
    Item(int Item_code, String Item_name, int Item_price){
        this.Item_code = Item_code;
        this.Item_name = Item_name;
        this.Item_price = Item_price;
    }
    void display_det(){
        System.out.printf("Item_code: %d\nItem_name: %s\nItem_price: %d\n", Item_code, Item_name, Item_price);
    }
    int price(int quantity){
        this.quantity = quantity;
        int price_ = quantity * Item_price;
        return price_;
    }
}
public class pb4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Item_code, Item_price, quantity;
        String Item_name;
        System.out.println("enter the Item code: ");
        Item_code = input.nextInt();
        input.nextLine();
        System.out.println("enter the Item name: ");
        Item_name = input.nextLine();
        System.out.println("enter the Item price: ");
        Item_price = input.nextInt();

        Item it1 = new Item(Item_code, Item_name, Item_price);
        it1.display_det();
        System.out.printf("enter how many %s you want: ",Item_name);
        quantity = input.nextInt();
        System.out.printf("price of the item: %d", it1.price(quantity));
    }
}
