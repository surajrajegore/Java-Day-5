import java.util.Scanner;

public class EvevOddProb7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number ");
        int number = sc.nextInt();
        if (number % 2==0)
        {
            System.out.println(number+" is even number");
        }
        else
        {
            System.out.println(number+" is odd number");
        }

    }
}
