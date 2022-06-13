import java.util.Scanner;

class HarmonicNumberProb4
{
static double nthHarmonic(int N)
{
        float harmonic = 1;

        for (int i = 2; i <= N; i++) {
            System.out.print("1/"+i+" ");
        harmonic += (float)1 / i;
        }
        System.out.println("");
        return harmonic;
        }
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of N: ");
    int N = sc.nextInt();

    System.out.print("nthHarmonic is ="+nthHarmonic(N));
}}