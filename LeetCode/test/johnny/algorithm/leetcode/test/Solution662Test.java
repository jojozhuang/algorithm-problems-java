package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution662;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution662Test {

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
        System.out.println("widthOfBinaryTree");
        Solution662 instance = new Solution662();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","3","2","5","3","#","9"});
        assertEquals(4, instance.widthOfBinaryTree(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"1","3","#","5","3"});
        assertEquals(2, instance.widthOfBinaryTree(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","3","2","5","#","#","#"});
        assertEquals(2, instance.widthOfBinaryTree(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","3","2","5","#","#","9","6","#","#","7"});
        assertEquals(8, instance.widthOfBinaryTree(root4));
    }

}
