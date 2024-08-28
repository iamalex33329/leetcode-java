package medium;

public class Problem2348 {

    public long zeroFilledSubarray(int[] nums) {

        int[] cntArr = new int[nums.length+1];

        for (int i=1; i<cntArr.length; i++) {

            for (int j=0; j<=nums.length-i; j++) {
                boolean check = true;
                for (int k=j; k<j+i; k++) {
                    if (nums[k] != 0) {
                        check = false;
                        break;
                    }
                }
                cntArr[i] += (check) ? 1 : 0;
            }
        }

        int result = 0;
        for (int n : cntArr) result += n;

        return result;
    }

    public long zeroFilledSubarray1(int[] nums) {
        long result = 0;

        for (int i=0, j=0; i<nums.length; i++) {
            if (nums[i] != 0) j = i + 1;
            else result += i - j + 1;
        }

        return result;
    }
}
