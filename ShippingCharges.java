import java.util.Scanner;
import java.util.InputMismatchException;

    /* This program calculates the total cost of an order including shipping charges,
    * using an if-else statement and simple calculations.
    * Laura Mitchell W0199744
    * PROG 1400 In-Class Exercise: Shipping Charges
    */
public class ShippingCharges {
    
void main() {
    // Create a scanner object
    Scanner input = new Scanner(System.in);

    // Assign shipping cost, total purchase, and total cost as type double
    double shippingCost;
    double totalPurchase;
    double totalCost;

    // Welcome message
    System.out.println("Welcome to our shop!");

    // Ask user to enter their total purchase price
    System.out.println("Enter the amount of your total purchase: ");
    // While loop to catch exceptions
    while (true) {
        try {
            totalPurchase = input.nextDouble();
            break;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            input.next();
            System.out.println("Enter the amount of your total purchase: ");
        }
    }
    
    // If customer purchase is under 50, add 10 dollars to shipping, else shipping is free
        if (totalPurchase < 50) {
            shippingCost = 10;
        } else {
            shippingCost = 0;
        }

    // Calculate total cost as shipping plus total purchase
    totalCost = totalPurchase + shippingCost;

    // Print out the total cost with a message
    System.out.printf("Your final total with shipping is: $%.2f%n", totalCost);
    
    // Close input
    input.close();
    
    }
}
