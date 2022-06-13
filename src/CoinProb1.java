import java.util.Scanner;
public class CoinProb1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many time coin you want to flip");
        int totalNumberCoinFlip = sc.nextInt();
        int heads = 0;
        int tails = 0;
        if (totalNumberCoinFlip > 0) {
            for (int coin = 1; coin <= totalNumberCoinFlip; coin++) {
                float randomCoin = (float) (Math.random() * 1.0);
                if (randomCoin > 0.50) {
                    tails++;
                } else {
                    heads++;
                }


            }
            double tailsPercentage =  ((double) tails / (double) totalNumberCoinFlip)*100;
            double headsPercentage = 100 - tailsPercentage;
            System.out.println("tails="+tailsPercentage+"%");
            System.out.println("tails="+headsPercentage+"%");


        }
    }
}
