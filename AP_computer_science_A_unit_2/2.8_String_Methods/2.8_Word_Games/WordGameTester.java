import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String base = input.nextLine();
        WordGames game = new WordGames(base);
        
        // Scramble it
        String scrambled = game.scramble();
        System.out.println("Scrambled: " + scrambled);
        
        // Ask for an index
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // consume newline
        
        // Ask for random word (to insert)
        System.out.println("Enter another word: ");
        String insertWord1 = input.nextLine();
        
        // Add random word at index
        String byIndex = game.bananaSplit(idx, insertWord1);
        System.out.println("After index insert: " + byIndex);
        
        // Ask for a character (store as a String)
        System.out.println("Enter a character to insert before: ");
        String insertChar = input.nextLine();  // treat as String per spec
        
        // Ask for random word (to insert)
        System.out.println("Enter another word: ");
        String insertWord2 = input.nextLine();
        
        // Add random word at character
        String byChar = game.bananaSplit(insertChar, insertWord2);
        System.out.println("After char insert: " + byChar);
        
        input.close();
        

    }
}