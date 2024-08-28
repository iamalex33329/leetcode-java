package medium;

import java.util.ArrayList;
import java.util.List;


class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("/").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf("/", i);
            int length = Integer.parseInt(str.substring(i, slash));
            i = slash + 1 + length;
            result.add(str.substring(slash + 1, i));
        }
        return result;
    }
}

public class Problem271 { }
