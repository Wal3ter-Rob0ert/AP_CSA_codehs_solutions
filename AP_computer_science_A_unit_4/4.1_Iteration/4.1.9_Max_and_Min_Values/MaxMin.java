import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            int max = 0;
            int min = 0;
            boolean first = true;
            
            while (true)
            {
                System.out.println("Enter a number or 0 to quit: ");
                number = scanner.nextInt();
                
                if (number == 0)
                {
                    break;
                }
                
                if (first)
                {
                    max = number;
                    min = number;
                    first = false;
                }
                else
                {
                    if (number > max)
                    {
                        max = number;
                    }
                    
                    if (number < min)
                    {
                        min = number;
                    }
                }
                
                System.out.println("Results so far:");
                System.out.println("Largest number: " + max);
                System.out.println("Smallest number: " + min);
            }
        }
    }
}