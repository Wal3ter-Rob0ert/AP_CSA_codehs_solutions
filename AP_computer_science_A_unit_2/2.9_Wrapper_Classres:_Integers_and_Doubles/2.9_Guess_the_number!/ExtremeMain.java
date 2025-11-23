import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Extremes ex = new Extremes();

        System.out.println("What do you think the maximum integer value is? ");
        Integer maxGuess = input.nextInt();

        Integer maxMultiplier = ex.maxQuotient(maxGuess);
        System.out.println("You'd need to multiply your number by " + maxMultiplier + " to reach the max value!");

        System.out.println("What do you think the minimum integer value is? ");
        Integer minGuess = input.nextInt();

        Integer minMultiplier = ex.minQuotient(minGuess);
        System.out.println("You'd need to multiply your number by " + minMultiplier + " to reach the min value!");

        input.close();
    }
}