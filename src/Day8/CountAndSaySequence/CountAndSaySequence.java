package Day8.CountAndSaySequence;

import java.util.ArrayList;

public class CountAndSaySequence {
    public String countAndSay(int n){
        int N=n-1;
        ArrayList<Integer> list= new ArrayList<>();
        String output="";
        while(N<=2){
            list.add(2);
            N-=2;
        }
        
        if(N==1){
            list.add(1);
        }


        return"";
    }
}