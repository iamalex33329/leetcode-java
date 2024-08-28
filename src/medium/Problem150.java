package medium;

import java.util.Stack;

public class Problem150 {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {
            if (t.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (t.equals("-")) {
                int x2 = stack.pop();
                int x1 = stack.pop();
                stack.push(x1 - x2);
            } else if (t.equals("/")) {
                int x2 = stack.pop();
                int x1 = stack.pop();
                stack.push(x1 / x2);
            } else if (t.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
