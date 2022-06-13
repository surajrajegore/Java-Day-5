import java.util.Scanner;

public class LargestAmongThreeProb10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number1:");
        int number1 = sc.nextInt();
        System.out.println("Enter value of number2:");
        int number2 = sc.nextInt();
        System.out.println("Enter value of number3:");
        int number3 = sc.nextInt();

        if(number1>number2 && number1>number3)
        {
            System.out.println(number1+" is larger");
        }
        else if (number2>number1 && number2>number3)
        {
            System.out.println(number2+" is larger");
        }
        else
        {
            System.out.println(number3+" is larger");
        }
    }
}
