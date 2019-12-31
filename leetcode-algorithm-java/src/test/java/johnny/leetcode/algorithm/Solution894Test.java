package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution894;
import johnny.leetcode.algorithm.common.TreeNode;

public class Solution894Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("allPossibleFBT");
        Solution894 instance = new Solution894();

        List<TreeNode> result1 = instance.allPossibleFBT(7);
        List<TreeNode> expect1 = new ArrayList<TreeNode>();
        expect1.add(TreeNode.createInstance("0,0,0,#,#,0,0,#,#,0,0"));
        expect1.add(TreeNode.createInstance("0,0,0,#,#,0,0,0,0,#,#"));
        expect1.add(TreeNode.createInstance("0,0,0,0,0,0,0"));
        expect1.add(TreeNode.createInstance("0,0,0,0,0,#,#,#,#,0,0,"));
        expect1.add(TreeNode.createInstance("0,0,0,0,0,#,#,0,0,#,#"));
        assertEquals(expect1.size(), result1.size());
        for (int i = 0; i < result1.size(); i++) {
            assertTrue(TreeNode.isSame(expect1.get(i), result1.get(i)));
        }
    }
}
