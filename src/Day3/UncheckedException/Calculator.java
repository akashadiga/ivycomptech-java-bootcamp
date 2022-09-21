package Day3.UncheckedException;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operator: +, -, *, /");
        char operator = sc.next().charAt(0);
        System.out.println("Enter first and second number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=0;
        switch (operator) {
            case '+':result = a + b;
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/':
                try { result = a / b;}
                catch (ArithmeticException e){ e.printStackTrace();}
            default:
                System.out.println("operator does not exist");
                break;
        }
        System.out.println(result);




    }
}

