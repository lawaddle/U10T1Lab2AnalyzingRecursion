import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        String str = "";
        if(number > 0)
        {
            return str + number + " " + countdown(number - 1);
        } else
        {
            return str + "Blastoff!";
        }
    }
}
