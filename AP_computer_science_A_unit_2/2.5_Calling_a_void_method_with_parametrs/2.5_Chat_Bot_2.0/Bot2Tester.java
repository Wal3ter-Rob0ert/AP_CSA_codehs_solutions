import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       // Start Here!
       Scanner input = new Scanner(System.in);

        // Ask for name
        System.out.println("Hello! What is your name?");
        String userName = input.nextLine();

        Bot2 bot = new Bot2(userName);
        bot.greeting();
        System.out.println();

        // Ask for favorite animal
        System.out.println("What is your favorite animal?");
        String animal = input.nextLine();
        bot.favoriteAnimal(animal);
        System.out.println();

        // Ask for desired travel place
        System.out.println("If you could visit any place, where would you go?");
        String place = input.nextLine();
        bot.destination(place);
        System.out.println();

        // Ask for favorite number
        System.out.println("What is your favorite number?");
        int number = input.nextInt();
        bot.favoriteNumber(number);
        System.out.println();

        // End the conversation
        bot.goodbye();

        input.close();
    }
}