package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution783;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution783Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDiffInBST");
        
        Solution783 instance1 = new Solution783();
        TreeNode root1 = TreeNode.createInstance(new String[] {"4","2","6","1","3","#","#"});
        assertEquals(1, instance1.minDiffInBST(root1));
        
        Solution783 instance2 = new Solution783();
        TreeNode root2 = TreeNode.createInstance(new String[] {"71","62","84","14","#","#","88","#","#","#","#"});
        assertEquals(4, instance2.minDiffInBST(root2));

        Solution783 instance3 = new Solution783();
        TreeNode root3 = TreeNode.createInstance(new String[] {"90","69","#","49","89","#","52","#","#","#","#"});
        assertEquals(1, instance3.minDiffInBST(root3));
    }
}
