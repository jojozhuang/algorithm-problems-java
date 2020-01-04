package johnny.leetcode.algorithm;

import johnny.algorithm.common.UndirectedGraphNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution133Test extends JunitBase {

    @Test
    public void testCloneGraph() {
        System.out.println("cloneGraph");
        Solution133 instance = new Solution133();

        assertEquals(null, instance.cloneGraph(null));
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        UndirectedGraphNode result2 = instance.cloneGraph(node2);
        assertEquals(result2.label, node2.label);
        
    }
}
