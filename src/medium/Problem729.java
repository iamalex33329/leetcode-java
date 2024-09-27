package medium;


public class Problem729 {

    private static class MyCalendar {

        static class Node {
            int start;
            int end;
            Node left, right;

            public Node(int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        private Node root;

        public MyCalendar() {}

        public boolean book(int start, int end) {
            // 第一個預約的人
            if (root == null) {
                root = new Node(start, end);
                return true;
            }
            // 後面要預約的人，就接著第一個人插入
            return insert(root, start, end);
        }

        private boolean insert(Node node, int start, int end) {
            if (end <= node.start) {  // 要預約的結束時間 < 當前預約的開始時間（代表往左邊找空位）
                if (node.left == null) {
                    node.left = new Node(start, end);
                    return true;
                }
                return insert(node.left, start, end);
            } else if (start >= node.end) {   // 要預約的開始時間 > 當前預約的結束時間（代表往右邊找空位）
                if (node.right == null) {
                    node.right = new Node(start, end);
                    return true;
                }
                return insert(node.right, start, end);
            } else {  // 在當前預約時間的中間（重疊）
                return false;
            }
        }
    }

}
