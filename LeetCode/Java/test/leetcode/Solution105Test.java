/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution105Test {
    
    public Solution105Test() {
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
     * Test of buildTree method, of class Solution105.
     */
    @Test
    public void testBuildTree() {
        System.out.println("buildTree");
        int[] preorder = null;
        int[] inorder = null;
        Solution105 instance = new Solution105();
        TreeNode expResult = null;
        TreeNode result = instance.buildTree(preorder, inorder);
        assertEquals(expResult, result);
        
        TreeNode result1 = instance.buildTree(new int[] {1}, new int[] {1});
        assertEquals(1, result1.val);
        
        TreeNode result2 = instance.buildTree(new int[] {1, 2}, new int[] {2, 1});
        assertEquals(1, result2.val);
        assertEquals(2, result2.left.val);
        assertEquals(null, result2.right);
        
        TreeNode result3 = instance.buildTree(new int[] {2,1,4,3}, new int[] {1,2,3,4});
        assertEquals(2, result3.val);
        assertEquals(1, result3.left.val);
        assertEquals(4, result3.right.val);
        assertEquals(3, result3.right.left.val);

        TreeNode result4 = instance.buildTree(new int[] {1,2,4,5,3,6,7}, new int[] {4,2,5,1,6,3,7});
        assertEquals(1, result4.val);
        assertEquals(2, result4.left.val);
        assertEquals(4, result4.left.left.val);
        assertEquals(5, result4.left.right.val);
        assertEquals(3, result4.right.val);
        assertEquals(6, result4.right.left.val);
        assertEquals(7, result4.right.right.val);
        
        TreeNode result5 = instance.buildTree(new int[] {1, 2, 3}, new int[] {3, 2, 1});
        assertEquals(1, result5.val);
        assertEquals(2, result5.left.val);
        assertEquals(3, result5.left.left.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
