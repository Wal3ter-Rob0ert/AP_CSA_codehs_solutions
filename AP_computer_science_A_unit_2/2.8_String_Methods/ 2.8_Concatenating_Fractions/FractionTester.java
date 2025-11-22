import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        Fraction f1 = new Fraction(1, 2);
        // Create a new Fraction with the user's input
        System.out.println("Enter the numerator: ");
        int userNum = input.nextInt();

        System.out.println("Enter the denominator: ");
        int userDen = input.nextInt();
        // Add the fractions
        Fraction f2 = new Fraction(userNum, userDen);
        // Make use of the getDenominator and getNumerator methods
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        int sumNumerator = (f1.getNumerator() * f2.getDenominator()) +
                           (f1.getDenominator() * f2.getNumerator());
        int sumDenominator = f1.getDenominator() * f2.getDenominator();

        Fraction sum = new Fraction(sumNumerator, sumDenominator);

        // Print result as an equation
        System.out.println(f1 + " + " + f2 + " = " + sum);

        input.close();
        
    }
}