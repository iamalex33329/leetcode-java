package medium;


public class Problem1381 {

    static class CustomStack {

        int[] stack;
        int top;

        public CustomStack(int maxSize) {
            stack = new int[maxSize];
            top = -1;
        }

        public void push(int x) {
            if (top != stack.length) stack[top++] = x;
        }

        public int pop() {
            if (top == -1) return -1;
            return stack[top--];
        }

        public void increment(int k, int val) {
            k = Math.min(k, top+1);
            for (int i=0; i<k; i++) stack[i] = stack[i] + val;
        }
    }
}
