package hard;


import java.util.HashMap;

class Problem2416 {

    private static class Trie {
        Trie[] children = new Trie[26];
        int count = 0;  // 用來儲存該節點所表示的前綴出現的次數
    }

    public int[] sumPrefixScores(String[] words) {
        Trie root = new Trie();

        // 建立 Trie，並計算 Prefix 次數
        for (String word : words) {
            Trie curr = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Trie();
                }
                curr = curr.children[index];
                curr.count++; // 該前缀出现一次
            }
        }

        // 計算每個 word 的 Sum of Prefix
        int[] result = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            Trie curr = root;
            int sum = 0;
            for (char c : words[i].toCharArray()) {
                curr = curr.children[c - 'a'];
                sum += curr.count; // 每到一個節點，累加該前綴的出現次數
            }
            result[i] = sum;
        }

        return result;
    }
}
