package johnny.lintcode.algorithm.common;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class DirectedGraphNode {
    public int label;
    public ArrayList<DirectedGraphNode> neighbors;
    public DirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<DirectedGraphNode>();
    }
}
