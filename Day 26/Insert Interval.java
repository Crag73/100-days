import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int ns = newInterval[0];
        int ne = newInterval[1];
        int i=0;
        while (i < intervals.length && intervals[i][1] < ns) {
            merged.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= ne) {
            ns = Math.min(ns, intervals[i][0]);
            ne = Math.max(ne, intervals[i][1]);
            i++;
        }
        merged.add(new int[]{ns, ne});
        while (i < intervals.length) {
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
