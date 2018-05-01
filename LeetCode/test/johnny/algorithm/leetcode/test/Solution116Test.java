package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution116;
import johnny.algorithm.leetcode.common.TreeLinkNode;

public class Solution116Test extends JunitBase {

    @Test
    public void testConnect() {
        System.out.println("connect");
        TreeLinkNode root = null;
        Solution116 instance = new Solution116();
        instance.connect(root);

        TreeLinkNode root3 = TreeLinkNode.CreateInstance(new String[] {"1","2","3","4","5","6","7"});
        instance.connect(root3);
        assertEquals(null, root3.next);
        assertEquals(3, root3.left.next.val);
        assertEquals(null, root3.right.next);
        assertEquals(5, root3.left.left.next.val);
        assertEquals(6, root3.left.right.next.val);
        assertEquals(7,root3.right.left.next.val);
        assertEquals(null, root3.right.right.next);
    }
}
