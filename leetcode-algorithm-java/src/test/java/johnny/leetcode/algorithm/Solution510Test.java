package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution510;

public class Solution510Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("inorderSuccessor");
        Solution510 instance = new Solution510();

        Solution510.Node node1 = instance.new Node();
        node1.val = 1;
        node1.left = instance.new Node();
        node1.left.val = 2;
        node1.left.parent = node1;
        node1.right = instance.new Node();
        node1.right.val = 3;
        node1.right.parent = node1;
        Solution510.Node result1 = instance.inorderSuccessor(node1);
        assertEquals(3, result1.val);
    }
}
