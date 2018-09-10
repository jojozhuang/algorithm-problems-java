package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution559;
import johnny.algorithm.leetcode.Solution590;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution559Test extends JunitBase {

    @Test
    public void testMaxDepth() {
        System.out.println("maxDepth");
        Solution559 instance = new Solution559();
        
        assertEquals(0, instance.maxDepth(null));

        Solution559.Node root2 = instance.deserialize("1,0");
        assertEquals(1, instance.maxDepth(root2));

        Solution559.Node root3 = instance.deserialize("1,1,4,0");
        assertEquals(2, instance.maxDepth(root3));

        Solution559.Node root4 = instance.deserialize("1,2,2,0,3,0");
        assertEquals(2, instance.maxDepth(root4));

        Solution559.Node root5 = instance.deserialize("1,3,3,2,5,0,6,0,2,0,4,0");
        assertEquals(3, instance.maxDepth(root5));
    }
}
