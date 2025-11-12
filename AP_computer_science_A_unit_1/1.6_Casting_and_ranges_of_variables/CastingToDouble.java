import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);

        System.out.print("First Int: ");
        int int1 = input.nextInt();

        System.out.print("Second Int: ");
        int int2 = input.nextInt();

        double result = (double) int1 / int2;

        System.out.println(result);

        input.close();

    }
}