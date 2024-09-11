package medium;

import java.util.ArrayList;
import java.util.List;


public class Problem3211 {

    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        int totalCombinations = (int) Math.pow(2, n);

        for (int i=0; i<totalCombinations; i++) {
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if (!binaryString.contains("00")) result.add(binaryString);
        }

        return result;
    }

    public List<String> validStrings2(int n) {
        List<String> combinations = new ArrayList<>();
        generateCombinations("", n, combinations);
        return combinations;
    }

    private void generateCombinations(String current, int n, List<String> combinations) {

        if (current.length() == n) {
            combinations.add(current);
            return;
        }

        generateCombinations(current + "1", n, combinations);

        // 如果當前字符串最後一位不是 '0'，則可以添加 '0'
        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generateCombinations(current + "0", n, combinations);
        }
    }
}
