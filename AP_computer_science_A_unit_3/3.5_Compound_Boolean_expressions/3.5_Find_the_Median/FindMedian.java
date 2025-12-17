import java.util.Scanner;

public class FindMedian
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int median;

        if ((a >= b && a <= c) || (a >= c && a <= b))
        {
            median = a;
        }
        else if ((b >= a && b <= c) || (b >= c && b <= a))
        {
            median = b;
        }
        else
        {
            median = c;
        }

        System.out.println("The median is " + median);

        input.close();  
    }
}