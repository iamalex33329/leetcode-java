package easy;

public class Problem1089 {

    public void duplicateZeros(int[] arr) {
        int[] cloneArr = arr.clone();
        int len = arr.length;
        int index = 0;

        for (int i = 0; i < len && index != len; i++) {
            arr[index++] = cloneArr[i];
            if (cloneArr[i] == 0 && index != len) arr[index++] = 0;
        }
    }
}
