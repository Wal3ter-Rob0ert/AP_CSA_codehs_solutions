import java.util.Scanner; // Import Scanner class for user input

public class DrinkOrder // Class definition
{
    public static void main(String[] args) // Main method
    {
        Scanner input = new Scanner(System.in); // Scanner object for user input
        
        System.out.println("What do you want to drink? "); // Prompt for drink
        String drink = input.nextLine(); // Read drink choice
        
        System.out.println("How many teaspoons of sugar do you want? "); // Prompt for sugar amount 
        int sugar = input.nextInt(); // Read sugar amount
        
        System.out.println("\nConfirming your order. You wanted: ");  // Confirm order
        
        if (sugar > 0) { // Check if sugar is added
            System.out.println(drink + " with sugar"); // Print drink with sugar
        } else { // No sugar added
            System.out.println(drink); // Print drink without sugar

            input.close(); // Close the scanner
        }
    }
}