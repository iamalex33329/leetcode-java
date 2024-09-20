package medium;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;


public class Problem179 {

    public String largestNumber(int[] nums) {

        String[] stringNums = new String[nums.length];
        for (int i=0; i<nums.length; i++) stringNums[i] = String.valueOf(nums[i]);

        Comparator<String> compare = (str1, str2) -> {
            String concatStr1 = str1 + str2;
            String concatStr2 = str2 + str1;
            return concatStr2.compareTo(concatStr1);
        };

        Arrays.sort(stringNums, compare);

        if (stringNums[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String stringNum : stringNums) sb.append(stringNum);
        return sb.toString();
    }
}
