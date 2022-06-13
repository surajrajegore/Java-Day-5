import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swap(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Values after swapping x= "+x+" y= "+y);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of  x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of y: ");
        int y = sc.nextInt();

        System.out.println("before swappin x= "+x+"y= "+y);
        swap(x,y);

    }
}
