package Day9.GenerateParenthesis;

import java.util.List;

public class GenerateParenthesisMain {
    public static void main(String[] args) {
    GenerateParenthesis GP = new GenerateParenthesis();
        List<String> a=GP.generateParenthesis(3);
    for(int i=0; i<a.size();i++)
        System.out.println(a.get(i));
    }
}