import java.util.Scanner;

public class PrimeFactorsProb5 {

    public void PrimeFact(int n)
    {
        int point = 2;
        while(n > 1)
        {
            if (n%point==0)
            {
                System.out.print(point + " ");
                n = n / point;
            }
            else
            {
                point++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();

        PrimeFactorsProb5 pf = new PrimeFactorsProb5();
        pf.PrimeFact(number);

    }

}
