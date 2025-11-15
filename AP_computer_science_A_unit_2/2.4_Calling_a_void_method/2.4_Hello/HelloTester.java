import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        Hello greeting = new Hello(userName);

        greeting.english();
        greeting.spanish();
        greeting.french();
        
        input.close();
    }
}