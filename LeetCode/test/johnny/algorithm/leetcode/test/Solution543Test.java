package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution543;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution543Test {

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
        System.out.println("diameterOfBinaryTree");
        Solution543 instance = new Solution543();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","3","4","5","#","#"});
        assertEquals(3, instance.diameterOfBinaryTree(root1));
    }

}
