import java.util.Scanner;

public class LeapYearProb2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid input in format of YYYY ");
        int year = sc.nextInt();
        if(year >=1000 && year <= 9999)
        {
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println(year+" year is a leap year");
            else
                System.out.println(year+" year is not a leap year");
        }
        else
        {
            System.out.println("Enter valid input in format of YYYY ");
        }

    }
}
