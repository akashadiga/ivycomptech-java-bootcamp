package Day2;
import  java.util.Scanner;
public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Base value");
        int base = scanner.nextInt();
        System.out.println("Enter the Power value");
        int pow = scanner.nextInt();
        int answer = 1;
        for (int i = 0; i < pow; i++) {
            answer = answer * base;
        }
        System.out.println(answer);
    }
}