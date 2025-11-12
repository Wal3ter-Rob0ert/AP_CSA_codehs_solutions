import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does dinner usually cost? ");
        double myDinner = input.nextDouble();

        System.out.println("How much is laser tag for one person? ");
        double laserTag = input.nextDouble();

        System.out.println("How much does a triple scoop cost? ");
        double myIceCream = input.nextDouble();

        double friendDinner = myDinner * 2;
        double friendLaserTag = laserTag;
        double friendIceCream = myIceCream / 3.0;

        double dinnerTotal = myDinner + friendDinner;
        double laserTagTotal = laserTag + friendLaserTag;
        double iceCreamTotal = myIceCream + friendIceCream;

       double grandTotal = dinnerTotal + laserTagTotal + iceCreamTotal;

        System.out.println();
        System.out.println("Dinner: $" + dinnerTotal);
        System.out.println("Laser Tag: $" + laserTagTotal);
        System.out.println("Ice cream: $" + iceCreamTotal);
        System.out.println("Grand Total: $" + grandTotal);

        input.close();
    }
}