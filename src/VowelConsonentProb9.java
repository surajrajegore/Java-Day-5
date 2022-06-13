import java.util.Scanner;

public class VowelConsonentProb9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one character ");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch+" is an vowel");
                break;
            default:
                System.out.println(ch+" is a consonent");

        }
    }
}
