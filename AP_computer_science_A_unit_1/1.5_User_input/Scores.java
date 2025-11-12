import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);

        // Prompt for first test
        System.out.print("Please enter the first test name: ");
        String test1 = input.nextLine();
        System.out.print("Please enter the first test score: ");
        double score1 = input.nextDouble();
        input.nextLine(); // consume newline

        // Prompt for second test
        System.out.print("Please enter the second test name: ");
        String test2 = input.nextLine();
        System.out.print("Please enter the second test score: ");
        double score2 = input.nextDouble();
        input.nextLine(); // consume newline

        // Prompt for third test
        System.out.print("Please enter the third test name: ");
        String test3 = input.nextLine();
        System.out.print("Please enter the third test score: ");
        double score3 = input.nextDouble();

        // Calculate average
        double average = (score1 + score2 + score3) / 3.0;

        // Print results
        System.out.println("Your average score is: " + average);

        input.close();
    }
}