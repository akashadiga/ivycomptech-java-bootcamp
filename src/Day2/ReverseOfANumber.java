package Day2;
import  java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit= scanner.nextInt();
        int rev=0;
        while(digit!= 0)
        {
            int rem = digit % 10;
            rev = rev * 10 + rem;
            digit = digit/10;
        }
        System.out.println(rev);
    }
}
