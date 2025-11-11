public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;

        int totalSeconds = hours * 3600;

       
        totalSeconds += minutes * 60;  
        totalSeconds += seconds;     

        
        System.out.println("The total shift time is " + totalSeconds + " seconds.");
    }
}