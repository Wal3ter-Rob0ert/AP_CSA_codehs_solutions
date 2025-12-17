import java.util.Scanner;

public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Short-circuiting prevents division by zero
        if (divisor != 0 && dividend % divisor == 0)
        {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        else
        {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }

        input.close();
    }
}