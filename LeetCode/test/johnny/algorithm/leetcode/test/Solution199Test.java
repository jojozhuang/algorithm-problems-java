package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution199;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution199Test {
    
    public Solution199Test() {
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
     * Test of rightSideView method, of class Solution199.
     */
    @Test
    public void testRightSideView() {
        System.out.println("rightSideView");
        TreeNode root = null;
        Solution199 instance = new Solution199();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.rightSideView(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);
        List<Integer> expResult1 = new ArrayList<Integer>();
        expResult1.add(1);
        assertEquals(expResult1, instance.rightSideView(root1));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(1);
        expResult2.add(2);
        assertEquals(expResult2, instance.rightSideView(root2));
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(1);
        expResult3.add(3);
        assertEquals(expResult3, instance.rightSideView(root3));
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.right = new TreeNode(5);
        root4.right = new TreeNode(3);
        root4.right.right = new TreeNode(4);
        List<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(1);
        expResult4.add(3);
        expResult4.add(4);
        assertEquals(expResult4, instance.rightSideView(root4));
    }
}
