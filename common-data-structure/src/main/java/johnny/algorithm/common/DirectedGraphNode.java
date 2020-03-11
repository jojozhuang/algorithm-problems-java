package johnny.algorithm.common;

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
        neighbors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return label + "";
    }
}
