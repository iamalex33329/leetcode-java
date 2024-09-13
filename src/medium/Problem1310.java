package medium;

public class Problem1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        int index = 0;

        for (int[] query : queries) {
            int temp = arr[query[0]];

            for (int i=query[0]+1; i<=query[1]; i++) temp ^= arr[i];
            result[index++] = temp;
        }

        return result;
    }

    public int[] xorQueries2(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXor = new int[n + 1];

        for (int i=0; i<n; i++) prefixXor[i+1] = prefixXor[i] ^ arr[i];

        int[] result = new int[queries.length];

        for (int i=0; i<queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            result[i] = prefixXor[right+1] ^ prefixXor[left];
        }

        return result;
    }
}
