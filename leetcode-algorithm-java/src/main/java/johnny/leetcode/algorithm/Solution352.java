package johnny.leetcode.algorithm;

import johnny.algorithm.common.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Data Stream as Disjoint Intervals.
 * Given a data stream input of non-negative integers a1, a2, ..., an, ...,
 * summarize the numbers seen so far as a list of disjoint intervals.
 * <p>
 * For example, suppose the integers from the data stream are 1, 3, 7, 2, 6, ...,
 * then the summary will be:
 * <p>
 * [1, 1]
 * [1, 1], [3, 3]
 * [1, 1], [3, 3], [7, 7]
 * [1, 3], [7, 7]
 * [1, 3], [6, 7]
 * Follow up:
 * What if there are lots of merges and the number of disjoint intervals are
 * small compared to the data stream's size?
 *
 * @author Johnny
 */
public class Solution352 {
    List<Interval> list;
    public Solution352() {
        list = new ArrayList<>();
    }

    public void addNum(int val) {
        if (list.size() == 0) {
            list.add(new Interval(val, val));
        } else if (val < list.get(0).start) {
            if (list.get(0).start - val == 1) {
                list.get(0).start = val;
            } else {
                list.add(0, new Interval(val, val));
            }
        } else if (val > list.get(list.size() - 1).end) {
            if (val - list.get(list.size() - 1).end == 1) {
                list.get(list.size() - 1).end = val;
            } else {
                list.add(new Interval(val, val));
            }
        } else {
            int start = 0;
            int end = list.size() - 1;
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                Interval interval = list.get(mid);
                if (val < interval.start) {
                    end = mid;
                } else if (val > interval.end) {
                    start = mid;
                } else {
                    // do nothing;
                    return;
                }
            }

            Interval left = list.get(start);
            Interval right = list.get(end);
            if (left.end + 1 == val && val + 1 == right.start) {
                left.end = right.end;
                list.remove(end);
            } else if (left.end + 1 == val) {
                left.end = val;
            } else if (right.start - 1 == val) {
                right.start = val;
            } else if (val > left.end + 1 && val < right.start - 1) {
                list.add(end, new Interval(val, val));
            }
        }
    }

    public int[][] getIntervals() {
        int[][] arr = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            arr[i][0] = list.get(i).start;
            arr[i][1] = list.get(i).end;
        }
        return arr;
    }


    /*
    TreeMap<Integer, Interval> tree;

    public Solution352() {
        tree = new TreeMap<>();
    }

    public void addNum(int val) {
        if (tree.containsKey(val)) return;
        Integer l = tree.lowerKey(val);
        Integer h = tree.higherKey(val);
        if (l != null && h != null && tree.get(l).end + 1 == val && h == val + 1) {
            tree.get(l).end = tree.get(h).end;
            tree.remove(h);
        } else if (l != null && tree.get(l).end + 1 >= val) {
            tree.get(l).end = Math.max(tree.get(l).end, val);
        } else if (h != null && h == val + 1) {
            tree.put(val, new Interval(val, tree.get(h).end));
            tree.remove(h);
        } else {
            tree.put(val, new Interval(val, val));
        }
    }

    public int[][] getIntervals() {
        int[][] arr = new int[tree.values().size()][2];
        int i = 0;
        for (Interval interval : tree.values()) {
            arr[i][0] = interval.start;
            arr[i][1] = interval.end;
            i++;
        }
        return arr;
    }*/
}
