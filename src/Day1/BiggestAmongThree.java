package Day1;

public class BiggestAmongThree {
        static void maxAmongThree(int first,int second,int third){
            if( first >= second && first >= third)
                System.out.println(first + " is the largest number.");
            else if (second >= first && second >= third)
                System.out.println(second + " is the largest number.");
            else
                System.out.println(third + " is the largest number.");
        }



}
