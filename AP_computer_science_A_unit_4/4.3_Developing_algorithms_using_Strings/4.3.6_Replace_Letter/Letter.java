import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        System.out.println("Enter the letter to be replaced: ");
        String letterToReplace = input.nextLine();
        
        System.out.println("Enter the new letter: ");
        String newLetter = input.nextLine();
        
        System.out.println("Result: " + replaceLetter(word, letterToReplace, newLetter));
    }
    
    public static String replaceLetter(String word, String letterToReplace, String newLetter)
    {
        String result = "";
        boolean firstFound = false;
        
        for (int i = 0; i < word.length(); i++)
        {
            String current = word.substring(i, i + 1);
            
            if (current.equals(letterToReplace))
            {
                if (!firstFound)
                {
                    result += current;
                    firstFound = true;
                }
                else
                {
                    result += newLetter;
                }
            }
            else
            {
                result += current;
            }
        }
        return result; 
    }  
}