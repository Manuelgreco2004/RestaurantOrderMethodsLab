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
        if (itemNumber == 1) {
        return 5.99; //Burger price
        } else if (itemNumber == 2) {
        return 8.99; //Pizza price
        } else if (itemNumber == 3) {
        return 4.99; //Salad price
        } else if (itemNumber == 4) {
        return 1.99; //Soda price
        } else {
        return 0.0; //Invalid menu number
        }
        

    }
    // Allows the customer to place an order
    // and returns the subtotal
    public static double takeOrder() {
        Scanner scanner = new Scanner(System.in);
 
        double totalCost = 0.0;
 
        System.out.println();
        System.out.println("Enter an item number (0 to finish):");
 
        // Looping and selection code is provided for you.
        while (true) {
            int choice = scanner.nextInt();

            double price = getItemPrice(choice);
            System.out.println("This will cost: " + price);
            totalCost += price;

            if (choice == 0) {
                break;
            }
 
            // TODO:
            // Call getItemPrice()

            // Add the returned price to totalCost

            System.out.println("Enter another item number (0 to finish): ");


        }
        scanner.close();
 
        // TODO: Return the subtotal
        System.out.println("==========================");
        System.out.println("ORDER TOTAL");
        System.out.println("=========================="); 
        
        System.out.println("Subtotal: $" + totalCost);
        return totalCost;
    }
 
    // Returns the total without a discount
    public static double calculateTotal(double totalCost) {
 
        // TODO: Return the total cost
        System.out.println("Total: $" + totalCost);
        return totalCost;
    }
 
    // Returns the total after applying a discount
    public static double calculateTotal(double totalCost, double discount) {
 
        // TODO: Calculate and return the discounted total
        double percent = discount * 100;
        double discountCost = totalCost - (totalCost * discount);

        System.out.println("Discount: " + percent + "%");
        System.out.println("With the 10% discount added: $" + String.format("%.2f%n", discountCost));
        return discountCost;
    }
 
    public static void main(String[] args) {
 
        displayMenu();
        //testing for Part 1
        System.out.println(getItemPrice(1)); 
        System.out.println(getItemPrice(2)); 
        System.out.println(getItemPrice(3)); 
        System.out.println(getItemPrice(4));
 
        // TODO:
        // Call takeOrder() and store the returned subtotal

        double subtotal = takeOrder();
 
        // TODO:
        // Call calculateTotal() using the subtotal

        calculateTotal(subtotal); //without discount
 
        // TODO:
        // Display the final total
        calculateTotal(subtotal, .10); //with discount
    }
}