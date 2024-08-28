package medium; 

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Problem1249 {

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> avoidIndex = new HashSet<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') stack.add(i);

            if (s.charAt(i) == ')') {
                if ((stack.isEmpty())) avoidIndex.add(i);
                else stack.pop();
            }
        }

        avoidIndex.addAll(stack);

        StringBuilder result = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (avoidIndex.contains(i)) continue;
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
