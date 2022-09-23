package Day9.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<String>();
        return getString(n, 1, 0, "(", combinations);
    }

    public List<String> getString(int value, int open, int close, String str, List<String> result) {

        if (open == value && close == open)
            result.add(str);
        else {
            if (open > close) {
                String temp = str;
                temp += ")";
                getString(value, open, close + 1, temp, result);
            }
            if (open < value) {
                String temp = str;
                temp += "(";
                getString(value, open + 1, close, temp, result);
            }
        }
        return result;
    }
}