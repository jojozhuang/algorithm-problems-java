package johnny.leetcode.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;
    public UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}
