package hard;

public class Problem42 {

    public int trap(int[] height) {
        int leftmax = 0, rightmax = 0, ans = 0;
        int left = 0, right = height.length - 1;

        if (height.length <= 2) { return 0; }

        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] < leftmax) {
                    ans += leftmax - height[left];
                } else {
                    leftmax = height[left];
                }
                left++;
            } else {
                if (height[right] < rightmax) {
                    ans += rightmax - height[right];
                } else {
                    rightmax = height[right];
                }
                right--;
            }

        }
        return ans;
    }
}
