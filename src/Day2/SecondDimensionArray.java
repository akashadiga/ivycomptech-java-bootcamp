package Day2;

public class SecondDimensionArray {
    public static void main(String[] args) {
        int row=2;
        int column=2;
        int[][] first = {{1, 2},
                        {3, 4},
                        {4, 5},
                        {6, 7}};
        int[][] second = {{2, 1},
                        {4, 3},
                        {5, 4},
                        {7, 6}};
        int[][] output = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                output[i][j]=first[i][j]+second[i][j];

            }
        }
    }
}
