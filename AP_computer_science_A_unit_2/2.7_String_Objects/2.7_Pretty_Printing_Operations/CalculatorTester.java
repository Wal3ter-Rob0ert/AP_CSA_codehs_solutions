import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Put your code here
        System.out.println("Enter two doubles");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        Calculator calc = new Calculator();

        double sum = calc.sum(num1, num2);
        double difference = calc.subtract(num1, num2);
        double product = calc.multiply(num1, num2);
        double quotient = calc.divide(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        input.close();
    }
}