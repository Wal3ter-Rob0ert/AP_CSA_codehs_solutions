import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("Enter the sales tax rate: ");
        double taxRate = input.nextDouble();

        System.out.println("How many boards do you need? ");
        int boards = input.nextInt();

        System.out.println("How many windows do you need? ");
        int windows = input.nextInt();

        // Create Construction object with given prices
        Construction project = new Construction(8.0, 11.0, taxRate);

        // Calculate costs
        double total = project.lumberCost(boards) + project.windowCost(windows);
        double grandTotal = project.grandTotal(total);

        // Output results
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + grandTotal);

        input.close();
        
        
    }
}