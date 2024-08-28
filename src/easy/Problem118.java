package easy;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

    public List<List<Integer>> generate(int numRows) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            List<List<Integer>> results = new ArrayList<>();
            results.add(newRow);

            for (int i=1; i<numRows; i++) {
                List<Integer> prevRow = results.get(i-1);

                newRow = new ArrayList<>();
                // generate new row
                newRow.add(1);
                for (int j=1; j<prevRow.size(); j++) { newRow.add(prevRow.get(j-1) + prevRow.get(j)); }
                newRow.add(1);

                results.add(newRow);
            }

            return results;
    }
}