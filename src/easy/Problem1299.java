package easy;

public class Problem1299 {

    public int[] replaceElements(int[] arr) {

        int prev_max = arr[arr.length-1];
        int curr = -1;

        arr[arr.length-1] = curr;

        for (int i=arr.length-2; i>=0; i--) {
            curr = arr[i];
            arr[i] = prev_max;
            prev_max = Math.max(curr, prev_max);
        }

        return arr;
    }
}
