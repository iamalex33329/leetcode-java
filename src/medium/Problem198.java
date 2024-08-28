package medium;

public class Problem198 {

    public int rob(int[] nums) {

        int rob = 0;
        int norob = 0;

        for (int num : nums) {
            int newRob = norob + num;               // 這輪搶 + 前一間不搶
            int newNoRob = Math.max(norob, rob);    // 這輪不搶 = max(前一輪有搶, 前一輪沒搶)
            rob = newRob;                           // 更新這輪搶的分數
            norob = newNoRob;                       // 更新這輪不搶的分數
        }
        return Math.max(rob, norob);
    }
}
