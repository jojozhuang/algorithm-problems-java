package johnny.algorithm.leetcode.common;

/**
 *
 * @author Johnny
 */
public class Interval {
    public int start;
    public int end;
    public Interval() { start = 0; end = 0; }
    public Interval(int s, int e) { start = s; end = e; }
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
}
