package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution257;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution257Test {
    
    public Solution257Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of binaryTreePaths method, of class Solution257.
     */
    @Test
    public void testBinaryTreePaths() {
        System.out.println("binaryTreePaths");
        TreeNode root = null;
        Solution257 instance = new Solution257();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.binaryTreePaths(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);
        List<String> expResult1 = new ArrayList<String>();
        expResult1.add("1");
        assertEquals(expResult1, instance.binaryTreePaths(root1));
        
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("1->2");
        assertEquals(expResult2, instance.binaryTreePaths(root2));
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        List<String> expResult3 = new ArrayList<String>();
        expResult3.add("1->2");
        expResult3.add("1->3");        
        assertEquals(expResult3, instance.binaryTreePaths(root3));
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.right = new TreeNode(5);
        root4.right = new TreeNode(3);
        List<String> expResult4 = new ArrayList<String>();
        expResult4.add("1->2->5");
        expResult4.add("1->3");        
        assertEquals(expResult4, instance.binaryTreePaths(root4));
    }
}
