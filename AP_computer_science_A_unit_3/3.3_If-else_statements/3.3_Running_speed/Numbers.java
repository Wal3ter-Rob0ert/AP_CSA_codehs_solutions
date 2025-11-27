import java.util.Scanner;

public class Numbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How fast cn you run a mile (in minutes)? ");
        int userTime = input.nextInt();

        if (userTime < 223) { 
            System.out.println("Are you sure? That's faster than the world record!");
        } else {
            System.out.println("Right on! Keep running!");
        }
        input.close();
    }
}