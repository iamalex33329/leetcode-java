package medium;

import java.util.HashMap;

public class Problem1371 {

    public int findTheLongestSubstring(String s) {

        int[] vowelToBit = new int[128];
        vowelToBit['a'] = 1 << 0; // 'a' -> 1
        vowelToBit['e'] = 1 << 1; // 'e' -> 2
        vowelToBit['i'] = 1 << 2; // 'i' -> 4
        vowelToBit['o'] = 1 << 3; // 'o' -> 8
        vowelToBit['u'] = 1 << 4; // 'u' -> 16

        // 哈希表記錄每個狀態第一次出現的位置
        HashMap<Integer, Integer> stateMap = new HashMap<>();
        stateMap.put(0, -1); // 初始狀態，位置 -1
        int currentState = 0;
        int maxLength = 0;

        // 遍歷字串
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (vowelToBit[ch] > 0) currentState ^= vowelToBit[ch];

            // 檢查哈希表中是否已有這個狀態
            if (stateMap.containsKey(currentState)) {
                int length = i - stateMap.get(currentState);
                maxLength = Math.max(maxLength, length);
            } else {
                stateMap.put(currentState, i);
            }
        }
        return maxLength;
    }
}
