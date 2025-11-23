public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double a1 = 0.0;
        double a2 = Math.PI / 2;
        double a3 = Math.PI;
        
        // Compute and round cos & sin for each angle
        printTrig(a1);
        printTrig(a2);
        printTrig(a3);
    }
    
    // Helper method to compute, round, and print
    public static void printTrig(double angle)
    {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);

        // Round to 2 decimal places
        cos = Math.round(cos * 100) / 100.0;
        sin = Math.round(sin * 100) / 100.0;

        System.out.println(angle + ": " + cos + ", " + sin);
    }
}