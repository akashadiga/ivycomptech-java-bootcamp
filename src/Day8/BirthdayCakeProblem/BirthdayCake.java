package Day8.BirthdayCakeProblem;

public class BirthdayCake {
    public int birthdayCakeCandles(int[] candels){
        int largestCandel= candels[0];
        int countOfLargestCandel=0;
        for (int i=0; i<candels.length; i++){
            if(largestCandel<candels[i]){
                largestCandel=candels[i];
            }
        }
        for (int i=0; i<candels.length;i++)
            if(largestCandel==candels[i])
                countOfLargestCandel++;
        return countOfLargestCandel;
    }

}