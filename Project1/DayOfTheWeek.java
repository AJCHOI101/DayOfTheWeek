import java.util.Scanner;
/**
 * Prints day of the week
 *
 * @author (Andrew Choi)
 * @version (02/18/2020)
 */
public class DayOfTheWeek
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DayOfTheWeek
     */
    public DayOfTheWeek()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    /**
     * Your program should prompt 
     * the user for three integers 
     * representing the month, 
     * the day of the month, 
     * and the four-digit year, 
     * and then print the 
     * corresponding 
     * day of the week. 
     * @param args no needed
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // User input month
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        // User input day
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();
        // User input year
        System.out.print("Enter the year (ex: 2020): ");
        int year = input.nextInt();
        System.out.println();

        // Print month/day/year --
        System.out.print(month + "/" + day + "/" + year + " -- ");

        // Treat 1st and 2nd months as 13th and 14th months of the previous year
        if (month == 1 || month == 2)
        {
            if (month == 1)
            {
                month = 13;
            }
            else
            {
                month = 14;
            }
            year--;
        }
        // Calculate the zeller number
        int zellerNumber = (day + ((26 * (month + 1)) / 10) 
                + year + (year / 4) + (6 * (year / 100)) 
                +  (year / 400));

        // Calcualte the day of week 
        int dayOfWeek = ((((zellerNumber + 5) % 7) + 1));

        // Holds integers value from 1-7 representing the days of the week
        switch (dayOfWeek)
        {           
            case 1: System.out.println("Monday"); 
            break;
            case 2: System.out.println("Tuesday"); 
            break;
            case 3: System.out.println("Wednesday"); 
            break;
            case 4: System.out.println("Thursday"); 
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday"); 
            break;
            default:
                System.out.println("Invalid day number.");
        }

    }
}

