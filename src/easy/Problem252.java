package easy;

import classes.Interval;
import java.util.List;


public class Problem252 {

    public boolean canAttendMeetings(List<Interval> intervals) {

        int[] timeslot = new int[1000001];

        for (Interval interval : intervals) {
            for (int i=interval.start; i<interval.end; i++) {
                if (timeslot[i] >= 1) return false;
                timeslot[i] += 1;
            }
        }

        return true;
    }
}
