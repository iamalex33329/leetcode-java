package medium;

public class Problem1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int[] count = new int[10001];
        int maxCount = 0;
        int maxNum = 0;

        // 統計每個條碼的出現次數，找出出現次數最多的條碼
        for (int num : barcodes) {
            count[num]++;
            if (count[num] > maxCount) {
                maxCount = count[num];
                maxNum = num;
            }
        }

        // 填充結果數組
        int[] result = new int[barcodes.length];
        int index = 0;
        // 先填充出現次數最多的條碼
        while (count[maxNum] > 0) {
            result[index] = maxNum;
            index += 2;
            count[maxNum]--;
        }

        // 填充其他條碼
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                // 偶數index的部分填完了，就換奇數index(從1開始)
                if (index >= barcodes.length) index = 1;
                result[index] = i;
                index += 2;
                count[i]--;
            }
        }

        return result;
    }
}
