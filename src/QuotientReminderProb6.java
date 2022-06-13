import java.util.Scanner;

public class QuotientReminderProb6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Divident:");
        int divident = sc.nextInt();
        System.out.println("Enter Value of Deviser:");
        int divisor = sc.nextInt();
        double Quotient = (double) (divident/divisor);
        int reminder = divident % divisor;

        System.out.println("Quotient is ="+Quotient);
        System.out.println("Reminder is ="+reminder);

    }
}
