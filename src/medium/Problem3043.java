package medium;


class Problem3043 {

    private static class Trie {
        Trie[] children = new Trie[10];  // 0~9
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie root = new Trie(); // 建立字典樹的根節點

        // 將 arr1 中的數字構建到字典樹中
        for (int num : arr1) {
            Trie curr = root;
            int divisor = getDivisor(num);
            while (divisor > 0) {
                int digit = (num / divisor) % 10;
                if (curr.children[digit] == null) {
                    curr.children[digit] = new Trie(); // 如果子節點為空，則創建新節點
                }
                curr = curr.children[digit];
                divisor /= 10;
            }
        }

        return getMaxLen(arr2, root);
    }

    private int getMaxLen(int[] arr2, Trie root) {
        int maxLen = 0;

        for (int num : arr2) {
            Trie curr = root;
            int divisor = getDivisor(num);
            int currentLen = 0;
            while (divisor > 0) {
                int digit = (num / divisor) % 10;
                curr = curr.children[digit];
                if (curr == null) break; // 沒有對應的子節點，結束當前查找
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
                divisor /= 10;
            }
        }
        return maxLen;
    }

    // 找到最高位數
    private int getDivisor(int num) {
        int divisor = 1;
        while (divisor * 10 <= num) {
            divisor *= 10;
        }
        return divisor;
    }
}
