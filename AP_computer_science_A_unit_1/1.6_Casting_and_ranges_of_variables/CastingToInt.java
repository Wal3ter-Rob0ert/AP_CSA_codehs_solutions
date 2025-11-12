import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a double: ");
        double myDouble = input.nextDouble();

        System.out.println(myDouble);

        int myInt = (int) myDouble;
        System.out.println(myInt);

        myDouble += 0.5;
        System.out.println(myDouble);

        myInt = (int) myDouble;
        System.out.println(myInt);

        input.close();
    }
}