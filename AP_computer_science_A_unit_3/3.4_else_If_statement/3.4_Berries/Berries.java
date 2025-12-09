import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        String response = input.nextLine();
        
        char berry = response.charAt(0);
        
        if (berry == 'E')
        {
            System.out.println("You ordered Elderberry");
        }
        else if (berry == 'G')
        {
            System.out.println("You ordered Gooseberry");
        }
        else if (berry == 'L')
        {
            System.out.println("You ordered Lingonberry");
        }
        else
        {
            System.out.println("Berry not recognized");
        }
        input.close();
    }
}