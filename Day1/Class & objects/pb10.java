import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    private static List<CartItem> cart = new ArrayList<>();

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                item.quantity += quantity;
                return;
            }
        }
        cart.add(new CartItem(itemName, price, quantity));
    }

    public static void removeItem(String itemName) {
        Iterator<CartItem> iterator = cart.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public static void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.price * item.quantity;
        }
        System.out.println("Total Cart Cost: $" + totalCost);
    }

    public static void displayCartItems() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Shopping Cart Items:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity + " = $" + (item.price * item.quantity));
        }
    }
}

public class pb10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Cart\n4. Display Total Cost\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    CartItem.addItem(name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.next();
                    CartItem.removeItem(removeName);
                    break;
                case 3:
                    CartItem.displayCartItems();
                    break;
                case 4:
                    CartItem.displayTotalCost();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
