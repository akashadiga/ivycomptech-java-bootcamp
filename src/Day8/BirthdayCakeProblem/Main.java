package Day8.BirthdayCakeProblem;

public class Main {
    public static void main(String[] args) {
        int[] candels={1, 2, 3, 4, 4};
        BirthdayCake cake = new BirthdayCake();
        System.out.println("candels blown by the child are "+cake.birthdayCakeCandles(candels));
    }
}