package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution513;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution513Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findBottomLeftValue");
        Solution513 instance = new Solution513();

        TreeNode root1 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(1, instance.findBottomLeftValue(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3","4","#","5","6","#","#","7","#","#","#"});
        assertEquals(7, instance.findBottomLeftValue(root2));

        // find bottom right
        TreeNode rootA = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(3, instance.findBottomRightValue(rootA));

        TreeNode rootB = TreeNode.createInstance(new String[] {"1","2","3","4","#","5","6","#","#","7","#","#","#"});
        assertEquals(7, instance.findBottomRightValue(rootB));
        
        TreeNode rootC = TreeNode.createInstance(new String[] {"1","2","3","4","#","5","6","#","#","7","#","8","#"});
        assertEquals(8, instance.findBottomRightValue(rootC));
    }
}
