package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution814;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution814Test {

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
        System.out.println("pruneTree");
        Solution814 instance = new Solution814();
        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","0","0","1"});
        TreeNode result1 = TreeNode.createInstance(new String[] {"1","#","0","#","1"});
        assertTrue(TreeNode.isSame(result1, instance.pruneTree(root1)));
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","0","1","0","0","0","1"});
        TreeNode result2 = TreeNode.createInstance(new String[] {"1","#","1","#","1"});
        assertTrue(TreeNode.isSame(result2, instance.pruneTree(root2)));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","1","0","1","1","0","1","0","#","#","#","#","#","#","#"});
        TreeNode result3 = TreeNode.createInstance(new String[] {"1","1","0","1","1","#","1"});
        assertTrue(TreeNode.isSame(result3, instance.pruneTree(root3)));
    }

}
