package johnny.leetcode.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class Interval {
    public int start;
    public int end;
    public Interval() { start = 0; end = 0; }
    public Interval(int s, int e) { start = s; end = e; }
    
    public static Interval[] buildArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        

        Interval[] intervals = new Interval[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intervals[i] = new Interval(arr[i][0], arr[i][1]);
        }
        
        return intervals;
    }

    public static List<Interval> buildList(int[][] arr) {
        Interval[] points = buildArray(arr);
        return ListUtil.buildList(points);
    }
    public static List<List<Interval>> buildList(int[][][] arr) {
        List<List<Interval>> res = new ArrayList<List<Interval>>();
        for (int i = 0; i < arr.length; i++) {
            res.add(buildList(arr[i]));
        }
        return res;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Interval)) {
            return false;
        }
        Interval c = (Interval)o;
        return start == c.start && end == c.end;
    }
    
    @Override
    public String toString() {
        return "["+start + "," + end +"]";
    }
}
