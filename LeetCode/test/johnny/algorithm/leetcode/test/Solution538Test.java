package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution538;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution538Test {

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
        System.out.println("convertBST");
        Solution538 instance = new Solution538();

        TreeNode root1 = TreeNode.createInstance(new String[] {"5","2","13"});
        TreeNode expect1 = TreeNode.createInstance(new String[] {"18","20","13"});
        assertTrue(TreeNode.isSame(expect1, instance.convertBST(root1)));
    }

}
