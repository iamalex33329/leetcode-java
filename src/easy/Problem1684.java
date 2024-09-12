package easy;


public class Problem1684 {

    public int countConsistentStrings(String allowed, String[] words) {

        int result = words.length;

        boolean[] letters = new boolean[26];
        for (Character c : allowed.toCharArray()) letters[c - 'a'] = true;

        for (String word : words) {
            for (Character c : word.toCharArray()) {
                if (!letters[c - 'a']) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
