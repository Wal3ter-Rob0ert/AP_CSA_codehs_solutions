public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    private int numClubs;
    
    // Add an instance variable called numClubs here.
    
    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor and how to add numClubs to the constructor. 
     */
    public Student(String fName, String lName, int studentGrade, int clubs)
    {
        firstName = fName;
        lastName = lName;
        grade = studentGrade;
        numClubs = clubs;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + grade +
               " and is in " + numClubs + " club(s).";
    }
}