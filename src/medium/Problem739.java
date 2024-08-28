package medium; 

import java.util.Stack;

public class Problem739 {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        return answer;
    }
}
