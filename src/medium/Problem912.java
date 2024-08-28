package medium;

public class Problem912 {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, nums.length);

        return nums;
    }

    private void mergeSort(int[] arr, int n) {

        // Divide
        if (n < 2) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(arr, 0, l, 0, mid);
        System.arraycopy(arr, mid, r, 0, n - mid);

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        // Combine
        int i = 0, j = 0, k = 0;

        while (i < mid && j < n-mid) {
            if (l[i] <= r[j]) { arr[k++] = l[i++]; }
            else { arr[k++] = r[j++]; }
        }

        while (i < mid) arr[k++] = l[i++];
        while (j < n-mid) arr[k++] = r[j++];
    }
}
