public class IntegerOverflow
{
    public static void main(String[] args)
    {
        // Start here!
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("The minimum value for an integer: " + min);
        System.out.println("The maximum value for an integer: " + max);

        System.out.println("The minimum value minus 1: " + (min - 1));
        System.out.println("The maximum value plus 1: " + (max + 1));
    }
}