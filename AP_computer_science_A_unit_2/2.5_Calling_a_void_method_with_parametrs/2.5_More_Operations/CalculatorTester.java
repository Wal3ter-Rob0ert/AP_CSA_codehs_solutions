import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter two doubles");

        // Read two double values
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        // Create a Calculator object
        Calculator calc = new Calculator();

        // Perform and print results
        calc.add(num1, num2);
        calc.subtract(num1, num2);
        calc.multiply(num1, num2);
        calc.divide(num1, num2);

        input.close();
    }
}