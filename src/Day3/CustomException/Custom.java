package Day3.CustomException;

import java.util.Scanner;

public class Custom {
    public static void main(String[] args) throws HeightException {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        if (height < 120) {
            throw new HeightException("Age is less than 120 cm");
        } else {
            System.out.println("you are eligible");
        }
    }
}
