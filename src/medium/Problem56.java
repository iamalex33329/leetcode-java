package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem56 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for (int i=1; i<intervals.length; i++) {
            if (list.get(list.size()-1)[0] < intervals[i][0] && intervals[i][0] < list.get(list.size()-1)[1]) {
                if (list.get(list.size()-1)[1] < intervals[i][1]) {
                    list.add(new int[]{list.get(list.size() - 1)[0], intervals[i][1]});
                    list.remove(list.size() - 2);
                }
            }
            else { list.add(intervals[i]); }
        }

        int[][] results = new int[list.size()][];
        for (int i=0; i<list.size(); i++) { results[i] = list.get(i); }

        return results;
    }
}
