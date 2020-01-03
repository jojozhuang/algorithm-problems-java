package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution623;
import johnny.algorithm.common.TreeNode;

public class Solution623Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("addOneRow");
        Solution623 instance = new Solution623();

        TreeNode root1 = TreeNode.createInstance(new String[] {"4","2","6","3","1","5","#"});
        TreeNode result1 = TreeNode.createInstance(new String[] {"4","1","1","2","#","#","6","3","1","5","#"});
        assertTrue(TreeNode.isSame(result1, instance.addOneRow(root1,1,2)));

        TreeNode root2 = TreeNode.createInstance(new String[] {"4","2","#","3","1"});
        TreeNode result2 = TreeNode.createInstance(new String[] {"4","2","#","1","1","3","#","#","1"});
        assertTrue(TreeNode.isSame(result2, instance.addOneRow(root2,1,3)));
    }
}
