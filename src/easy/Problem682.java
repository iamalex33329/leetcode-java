package easy;

import java.util.Stack;

public class Problem682 {

    public int calPoints(String[] operations) {

        Stack<String> strings = new Stack<>();

        for (String s : operations) {
            if (s.equals("C")) {
                strings.pop();
            } else if (s.equals("D")) {
                int v = Integer.parseInt(strings.peek());
                strings.add(String.valueOf(v * 2));
            } else if (s.equals("+")) {
                int v2 = Integer.parseInt(strings.pop());
                int v1 = Integer.parseInt(strings.pop());
                strings.add(String.valueOf(v1));
                strings.add(String.valueOf(v2));
                strings.add(String.valueOf(v1 + v2));
            } else {
                strings.add(s);
            }
        }

        int result = 0;
        for (String s : strings) { result += Integer.parseInt(s); }

        return result;
    }

    public int calPoints1(String[] operations) {

        int[] resultArr = new int[operations.length];
        int idx = 0;

        for (String operation : operations) {
            if (operation.equals("+")) {
                resultArr[idx] = resultArr[idx - 1] + resultArr[idx - 2];
                idx++;
            } else if (operation.equals("C")) {
                idx--;
            } else if (operation.equals("D")) {
                resultArr[idx] = resultArr[idx-1] * 2;
                idx++;
            } else {
                resultArr[idx++] = Integer.parseInt(operation);
            }
        }

        int result = 0;
        for (int i=0; i<idx; i++) result += resultArr[i];

        return result;
    }
}
