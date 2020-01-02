package johnny.algorithm.common;

/**
 *
 * @author Johnny
 */
public class SegmentTreeNode {
    public int start, end;
    public int max, min, sum; // You can add other additional attributes
    public SegmentTreeNode left, right;
    
    public SegmentTreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        this.left = null;
        this.right = null;
    }
}
