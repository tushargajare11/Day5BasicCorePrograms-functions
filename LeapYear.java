package Day5;
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[])
    {
        int year=0;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year>=9999 && year<=1000) {
            System.out.println("you enter a year"+year);
        }
        else
        {
            System.out.println("you are not entered year"+year);

        }
        // If a year is multiple of 400 & 4
        // then it is a leap year
        // Else If a year is multiple of 100,
        // then it is not a leap year
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(" year is a leap year");
        else
            System.out.println(" year is not a leap year");
    }
}
