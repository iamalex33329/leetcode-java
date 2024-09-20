package medium;

import java.util.ArrayList;
import java.util.List;


public class Problem241 {

    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> result = new ArrayList<>();

        for (int i=0; i<expression.length(); i++) {

            char oper = expression.charAt(i);

            // 如果遇到運算符號，拆成左邊右邊
            if (oper == '+' || oper == '-' || oper == '*') {
                List<Integer> s1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> s2 = diffWaysToCompute(expression.substring(i + 1));

                for (int a : s1) {
                    for (int b : s2) {
                        if (oper == '+') result.add(a + b);
                        else if (oper == '-') result.add(a - b);
                        else result.add(a * b);
                    }
                }
            }
        }

        if (result.isEmpty()) result.add(Integer.parseInt(expression));

        return result;
    }
}
