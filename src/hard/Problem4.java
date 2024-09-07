package hard;

import java.util.Arrays;

public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

        Arrays.sort(result);

        if (result.length % 2 == 1) {
            return result[result.length / 2];
        } else {
            return (result[result.length / 2 - 1] + result[result.length / 2]) / 2.0;
        }
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        // 保持 nums1 是較短的數組
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            // 對 nums1 進行二分搜尋
            int partitionX = (low + high) / 2;
            // 保證左半邊與右半邊的總數相等或相差一
            int partitionY = (m + n + 1) / 2 - partitionX;

            // 如果切割在 nums1 的最左邊或最右邊，設置為負無窮或正無窮
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            // 如果切割在 nums2 的最左邊或最右邊，設置為負無窮或正無窮
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // 確保左邊的最大值小於等於右邊的最小值
            if (maxX <= minY && maxY <= minX) {
                // 總數為奇數時，取左邊最大值為中位數
                if ((m + n) % 2 == 1) {
                    return Math.max(maxX, maxY);
                } else {
                    // 總數為偶數時，取左邊最大值與右邊最小值的平均
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                }
            } else if (maxX > minY) {
                // 移動 partitionX 向左
                high = partitionX - 1;
            } else {
                // 移動 partitionX 向右
                low = partitionX + 1;
            }
        }
        return 0.0;
    }
}
