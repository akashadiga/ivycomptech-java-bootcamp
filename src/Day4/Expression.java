package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Expression {
    private List<Character> leftBrackets
            = Arrays.asList('(', '<', '[', '{');
    private List<Character> rightBrackets
            = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (leftBrackets.contains(ch))
                stack.push(ch);

            if (rightBrackets.contains(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!(leftBrackets.indexOf(top) == rightBrackets.indexOf(ch))) return false;
            }
        }

        return stack.empty();
    }
    public static void main(String[] args) {
        Expression exp= new Expression();
        System.out.println(exp.isBalanced("({{[]}})"));
    }
}