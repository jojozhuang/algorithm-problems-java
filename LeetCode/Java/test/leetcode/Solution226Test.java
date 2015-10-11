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
public class Solution226Test {
    
    public Solution226Test() {
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
     * Test of invertTree method, of class Solution226.
     */
    @Test
    public void testInvertTree() {
        System.out.println("invertTree");
        TreeNode root = null;
        Solution226 instance = new Solution226();
        TreeNode expResult = null;
        TreeNode result = instance.invertTree(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);
        assertEquals(root1, instance.invertTree(root1));
        
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        TreeNode result2 = instance.invertTree(root2);
        assertEquals(1, result2.val);
        assertEquals(2, result2.right.val);
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        TreeNode result3 = instance.invertTree(root3);
        assertEquals(1, result3.val);
        assertEquals(3, result3.left.val);
        assertEquals(2, result3.right.val);
        
        TreeNode root4 = new TreeNode(4);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(1);
        root4.left.right = new TreeNode(3);
        root4.right = new TreeNode(7);
        root4.right.left = new TreeNode(6);
        root4.right.right = new TreeNode(9);
        TreeNode result4 = instance.invertTree(root4);
        assertEquals(4, result4.val);
        assertEquals(7, result4.left.val);
        assertEquals(2, result4.right.val);
        assertEquals(9, result4.left.left.val);
        assertEquals(6, result4.left.right.val);
        assertEquals(3, result4.right.left.val);
        assertEquals(1, result4.right.right.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
