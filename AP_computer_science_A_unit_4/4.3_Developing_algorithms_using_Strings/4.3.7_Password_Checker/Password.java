import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password:");
        String password = input.nextLine();

        System.out.println(passwordCheck(password));
    }

    public static boolean passwordCheck(String password)
    {
        if (password.length() < 8)
        {
            return false;
        }

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";

        for (int i = 0; i < password.length(); i++)
        {
            String current = password.substring(i, i + 1);

            if (letters.indexOf(current) == -1 && digits.indexOf(current) == -1)
            {
                return false;
            }
        }

        return true;
    }

}