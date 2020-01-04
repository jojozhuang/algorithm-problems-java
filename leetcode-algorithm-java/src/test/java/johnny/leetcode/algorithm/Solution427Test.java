package johnny.leetcode.algorithm;

import johnny.algorithm.common.QuadNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution427Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Quad Tree");
        
        int[][] grid1 = new int[][] {
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0}
        };
        Solution427 instance = new Solution427();
        QuadNode node = instance.construct(grid1);

        // level 0
        assertEquals(false, node.isLeaf);
        assertEquals(false, node.val);
        // level 1
        assertEquals(true, node.topLeft.isLeaf);
        assertEquals(true, node.topLeft.val);
        assertEquals(false, node.topRight.isLeaf);
        assertEquals(false, node.topRight.val);
        assertEquals(true, node.bottomLeft.isLeaf);
        assertEquals(true, node.bottomLeft.val);
        assertEquals(true, node.bottomRight.isLeaf);
        assertEquals(false, node.bottomRight.val);
        // level 2
        assertEquals(true, node.topRight.topLeft.isLeaf);
        assertEquals(false, node.topRight.topLeft.val);
        assertEquals(true, node.topRight.topRight.isLeaf);
        assertEquals(false, node.topRight.topRight.val);
        assertEquals(true, node.topRight.bottomLeft.isLeaf);
        assertEquals(true, node.topRight.bottomLeft.val);
        assertEquals(true, node.topRight.bottomRight.isLeaf);
        assertEquals(true, node.topRight.bottomRight.val);
    }
}
