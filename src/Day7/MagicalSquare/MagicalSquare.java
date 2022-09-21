package Day7.MagicalSquare;

public class MagicalSquare {
    public void sqaure(int[][] array, int length) {
        int dig1 = 0;
        int dig2 = 0;
        int i;
        int j;
        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                if (i == j) {
                    dig1 += array[i][j];
                }if (i + j + 1 == length) {
                    dig2 += array[i][j];
                }
            }
        }
        if (dig1 == dig2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
