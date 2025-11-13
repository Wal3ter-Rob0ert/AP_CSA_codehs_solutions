public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website site1 = new Website();
        
        Website site2 = new Website("goodSchool", "edu");
        
        Website site3 = new Website("codehs", "com", 1000000);
    
        System.out.println(site1);
        System.out.println(site2);
        System.out.println(site3);
    }
}