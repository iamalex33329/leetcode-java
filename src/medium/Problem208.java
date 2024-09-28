package medium;


public class Problem208 {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    static class Trie {
        private TrieNode root = new TrieNode();

        public Trie() {}

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.isEndOfWord = true;
        }

        public boolean search(String word) {
            TrieNode node = searchPrefix(word);
            return node != null && node.isEndOfWord;
        }

        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

        private TrieNode searchPrefix(String prefix) {
            TrieNode node = root;
            for (char c : prefix.toCharArray()) {
                int idx = c - 'a';
                if (node.children[idx] == null) {
                    return null;
                }
                node = node.children[idx];
            }
            return node;
        }
    }
}
