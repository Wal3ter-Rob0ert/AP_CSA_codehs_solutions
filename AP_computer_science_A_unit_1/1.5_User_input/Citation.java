import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);

        // Ask for author
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String author = input.nextLine();

        // Ask for year
        System.out.println("Enter the year the book was published: ");
        String year = input.nextLine();

        // Ask for title
        System.out.println("Enter the title of the book: ");
        String title = input.nextLine();

        // Ask for publisher
        System.out.println("Enter the publisher of the book: ");
        String publisher = input.nextLine();

        // Print citation in MLA format
        System.out.println(author + ". " + title + ".");
        System.out.println(publisher + ", " + year + ".");

        input.close();
    }
}