package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution117;
import johnny.algorithm.leetcode.common.TreeLinkNode;

public class Solution117Test extends JunitBase {

    @Test
    public void testConnect() {
        System.out.println("connect");
        TreeLinkNode root = null;
        Solution117 instance = new Solution117();
        instance.connect(root);

        TreeLinkNode root3 = TreeLinkNode.CreateInstance(new String[] {"1","2","3","4","5","#","7"});
        instance.connect(root3);
        assertEquals(null, root3.next);
        assertEquals(3, root3.left.next.val);
        assertEquals(null, root3.right.next);
        assertEquals(5, root3.left.left.next.val);
        assertEquals(7, root3.left.right.next.val);
        assertEquals(null, root3.right.left);
        assertEquals(null, root3.right.right.next);

        TreeLinkNode root4 = TreeLinkNode.CreateInstance(new String[] {"1","2","3","4","#","#","5"});
        instance.connect(root4);
        assertEquals(null, root4.next);
        assertEquals(3, root4.left.next.val);
        assertEquals(null, root4.right.next);
        assertEquals(5, root4.left.left.next.val);
        assertEquals(null, root4.left.right);
        assertEquals(null, root4.right.left);
        assertEquals(null, root4.right.right.next);

        TreeLinkNode root5 = TreeLinkNode.CreateInstance(new String[] {"1","2","2","3","3","3","3","4","4","4","4","4","4","#","#","5","5"});
        instance.connect(root5);

        TreeLinkNode root6 = TreeLinkNode.CreateInstance(new String[] {"3","9","20","#","#","15","7"});
        instance.connect(root6);
        assertEquals(null, root6.next);
        assertEquals(20, root6.left.next.val);
        assertEquals(null, root6.right.next);
        assertEquals(null, root6.left.left);
        assertEquals(null, root6.left.right);
        assertEquals(7, root6.right.left.next.val);
        assertEquals(null, root6.right.right.next);
    }
}
