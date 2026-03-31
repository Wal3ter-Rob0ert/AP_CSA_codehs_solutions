import java.util.Scanner;
public class GuessTheNumber
{ 
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
    
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {  
    
        Scanner input = new Scanner(System.in);
        
        int guess = 0;
        
        while (guess != everestHeight)
        {
            System.out.print("Guess the height: ");
            guess = input.nextInt();
            
            if (guess != everestHeight)
            {
                System.out.println("That's not it!");
            }
        }
        
        System.out.println("Right! Mt. Everest is " + everestHeight + " meters tall!");

        input.close();  
         
    }
}