package medium;

public class Problem11 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int result = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (result <  height[l] * (r - l)) {
                    result = height[l] * (r - l);
                } else {
                    l++;
                }
            } else {
                if (result <  height[r] * (r - l)) {
                    result = height[r] * (r - l);
                } else {
                    r--;
                }
            }
        }

        return result;
    }
}
