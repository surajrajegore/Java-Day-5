import java.util.Scanner;

public class TwoPowerProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBER = 2;
        int temp = 1;
        System.out.println("Enter value of for Upper limit");
        int power = sc.nextInt();
        if (power >= 0 && power <= 31) {
            for (int p = 0; p <= power; p++) {
                if(p==0)
                {
                    p=1;
                }
                temp= temp * NUMBER;
                System.out.println(p+" ^ 2 = "+temp);
            }

        }
        else
        {
            System.out.println("Enter valid input Value out of range of int ");
        }
    }

}
