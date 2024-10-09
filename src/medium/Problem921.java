package medium;

import java.util.Stack;

public class Problem921 {

    public int minAddToMakeValid(String s) {

        int openParenthesis = 0;
        int closeParenthesis = 0;

        for (var i : s.getBytes()) {
            if (i == '(') openParenthesis++;
            else if (i == ')' && openParenthesis > 0) openParenthesis--;
            else closeParenthesis++;
        }

        return openParenthesis + closeParenthesis;
    }
}
