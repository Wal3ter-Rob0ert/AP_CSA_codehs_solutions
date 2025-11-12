public class FallingBodies
{
    public static void main(String[] args)
    {
        final double g = 9.8; 

        double t = 23.0;

        double height = 0.5 * g * t * t;
        double velocity = g * t;

        System.out.println("The height of the cliff is " + height + " m.");
        System.out.println("The final velocity of the ball is " + velocity + " m/s.");
    }
}