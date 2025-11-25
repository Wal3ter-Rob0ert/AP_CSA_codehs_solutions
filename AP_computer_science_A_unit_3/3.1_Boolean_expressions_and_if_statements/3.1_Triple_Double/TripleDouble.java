import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score? ");
        int points = input.nextInt();
        
        System.out.println("How many rebounds did you get? ");
        int rebounds = input.nextInt();
        
        System.out.println("How many assists did you have? ");
        int assists = input.nextInt();
        // Create three boolean variables that
        boolean hasPoints = points >= 10;
        boolean hasRebounds = rebounds >= 10;
        boolean hasAssists = assists >= 10;
        // check if the stats are 10 or more
        
        // Print out the value of each boolean
        System.out.println("You got 10 or more points: " + hasPoints);
        System.out.println("You got 10 or more rebounds: " + hasRebounds);
        System.out.println("You got 10 or more assists: " + hasAssists);
        // variable.  Be sure to label them!
        
        input.close();
    }
}