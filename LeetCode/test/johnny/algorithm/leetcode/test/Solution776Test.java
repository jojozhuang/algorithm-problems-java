package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution776;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution776Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("splitBST");
        Solution776 instance = new Solution776();

        TreeNode root1 = TreeNode.createInstance(new String[] {"4","2","6","1","3","5","7"});
        TreeNode expect11 = TreeNode.createInstance(new String[] {"2","1","#"});
        TreeNode expect12 = TreeNode.createInstance(new String[] {"4","3","6","#","#","5","7"});
        TreeNode[] result1 = instance.splitBST(root1, 2);
        assertTrue(TreeNode.isSame(expect11, result1[0]));
        assertTrue(TreeNode.isSame(expect12, result1[1]));
    }

}
