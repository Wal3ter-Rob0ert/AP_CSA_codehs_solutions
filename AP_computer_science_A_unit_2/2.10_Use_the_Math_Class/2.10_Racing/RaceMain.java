public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double accel1 = Math.random() * 5 + 1;  
        double accel2 = Math.random() * 5 + 1;
        
        accel1 = Math.round(accel1 * 100) / 100.0;
        accel2 = Math.round(accel2 * 100) / 100.0;
        
        // Create two Racecar objects
        Racecar car1 = new Racecar(accel1, "Lightning");
        Racecar car2 = new Racecar(accel2, "Thunder");
        // Compute the finishing times for both cars
        double time1 = car1.computeTime(distance);
        double time2 = car2.computeTime(distance);
        // Print times of each car
        System.out.println("First car finished in " + time1 + " seconds");
        System.out.println("Second car finished in " + time2 + " seconds");
        
    }
}