import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();    
        // Ask user for month of year as an integer
        if (month >= 3 && month <= 6)
        {
            System.out.println("Spring spawning season");
        }
        // Use if/else if/else statement to determine if it is spawning season
        else if (month >= 9 && month <= 11)
        {
            System.out.println("Fall spawning season");
        }
        else
        {
            System.out.println("Not spawning season");
        }

        input.close();
    }
}