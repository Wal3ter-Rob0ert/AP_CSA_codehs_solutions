import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int actual = input.nextInt();
        
        // Compare numbers by creating three booleans
        boolean wentOver = actual > goal;
        boolean underGoal = actual < goal;;
        boolean metGoal = actual == goal;
        
        // Display results as instructed
        System.out.println("Went over goal? " +wentOver);
        System.out.println("Did not meet goal? " + underGoal);
        System.out.println("Met goal exactly? " + metGoal);
    }
}