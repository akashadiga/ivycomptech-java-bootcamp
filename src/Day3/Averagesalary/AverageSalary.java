package Day3.Averagesalary;
public class AverageSalary {
    public static double average(int[] salary){
        int n = salary.length;

        if (salary.length <= 3 && salary.length >= 100)
            System.out.println("Salary is either less than 3 or greater than 10");
        for (int s = 0; s == n; s++) {
            if (salary[s] <= 1000 && salary[s] >= 100)
                System.out.println("Salary value is not in range");
        }
        int a = Integer.MAX_VALUE, b = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + salary[i];
            a = Math.min(a, salary[i]);
            b = Math.max(b, salary[i]);
        }
        double ans = (sum - a - b) / ((n - 2) * 1.0);
        if (n > 2)
            return ans;
        else
            return 0;
    }

    public static void main(String[] args){
        int[] arr = {123, 456, 789};
        double answer = average(arr);
        System.out.println(answer);
    }
}





