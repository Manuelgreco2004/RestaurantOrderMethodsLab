import java.util.Scanner;
 
public class RestaurantOrder {
 
    // Displays the restaurant menu
    public static void displayMenu() {
        System.out.println("===== RESTAURANT MENU =====");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza  - $8.99");
        System.out.println("3. Salad  - $4.99");
        System.out.println("4. Soda   - $1.99");
        System.out.println("0. Finish Order");
    }
 
    // Returns the price of the selected item
    public static double getItemPrice(int itemNumber) {
        // TODO: Return the correct price based on itemNumber
 
        return 0.0;
    }
 
    // Allows the customer to place an order
    // and returns the subtotal
    public static double takeOrder() {
        Scanner scanner = new Scanner(System.in);
 
        double totalCost = 0.0;
 
        System.out.println();
        System.out.println("Enter an item number (0 to finish):");
 
        while (true) {
 
            int choice = scanner.nextInt();
 
            if (choice == 0) {
                break;
            }
 
            // TODO:
            // Call getItemPrice()
            // Add the returned price to totalCost
 
            System.out.println("Enter another item number (0 to finish):");
        }
 
        // TODO: Return the subtotal
        return 0.0;
    }
 
    // Returns the total without a discount
    public static double calculateTotal(double totalCost) {
 
        // TODO: Return the total cost
 
        return 0.0;
    }
 
    // Returns the total after applying a discount
    public static double calculateTotal(double totalCost, double discount) {
 
        // TODO: Calculate and return the discounted total
 
        return 0.0;
    }
 
    public static void main(String[] args) {
 
        displayMenu();
 
        // TODO:
        // Call takeOrder() and store the returned subtotal
 
        // TODO:
        // Call calculateTotal() using the subtotal
 
        // TODO:
        // Display the final total
    }
}