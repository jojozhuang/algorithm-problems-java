package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution558;

public class Solution558Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("558. Quad Tree Intersection");
        Solution558 instance = new Solution558();

        Solution558.Node node1 = instance.new Node();
        node1.val = true;
        node1.isLeaf = false;
        node1.topLeft = instance.new Node(true, true);
        node1.topRight = instance.new Node(true, true);
        node1.bottomLeft = instance.new Node(false, true);
        node1.bottomRight = instance.new Node(false, true);
        
        Solution558.Node node2 = instance.new Node();
        node2.val = true;
        node2.isLeaf = false;
        node2.topLeft = instance.new Node(true, true);
        node2.topRight = instance.new Node(true, false);
        node2.topRight.val = true;
        node2.topRight.isLeaf = false;
        node2.topRight.topLeft = instance.new Node(false, true);
        node2.topRight.topRight = instance.new Node(false, true);
        node2.topRight.bottomLeft = instance.new Node(true, true);
        node2.topRight.bottomRight = instance.new Node(true, true);
        node2.bottomLeft = instance.new Node(true, true);
        node2.bottomRight = instance.new Node(false, true);

        Solution558.Node result = instance.intersect(node1, node2);
        assertEquals(false, result.val);
        assertEquals(false, result.isLeaf);
        assertEquals(true, result.topLeft.val);
        assertEquals(true, result.topLeft.isLeaf);
        assertEquals(true, result.topRight.val);
        assertEquals(true, result.topRight.isLeaf);
        assertEquals(true, result.bottomLeft.val);
        assertEquals(true, result.bottomLeft.isLeaf);
        assertEquals(false, result.bottomRight.val);
        assertEquals(true, result.bottomRight.isLeaf);
    }
}
