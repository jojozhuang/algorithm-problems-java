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
public class Solution110Test {
    
    public Solution110Test() {
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
     * Test of isBalanced method, of class Solution110.
     */
    @Test
    public void testIsBalanced() {
        System.out.println("isBalanced");
        TreeNode root = null;
        Solution110 instance = new Solution110();
        boolean expResult = true;
        boolean result = instance.isBalanced(root);
        assertEquals(expResult, result);
        
        TreeNode p1 = new TreeNode(1);
        assertEquals(true, instance.isBalanced(p1));

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        assertEquals(true, instance.isBalanced(p2));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(2);
        assertEquals(true, instance.isBalanced(p3));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(2);
        p4.right.left = new TreeNode(3);
        assertEquals(true, instance.isBalanced(p4));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        p5.right = new TreeNode(2);
        p5.right.right = new TreeNode(3);
        p5.right.right.right = new TreeNode(4);
        assertEquals(false, instance.isBalanced(p5));

        TreeNode p6 = new TreeNode(1);
        p6.left = new TreeNode(2);
        p6.left.left = new TreeNode(3);
        p6.left.left.left = new TreeNode(4);
        p6.right = new TreeNode(2);
        p6.right.right = new TreeNode(3);
        p6.right.right.right = new TreeNode(4);
        assertEquals(true, instance.isBalanced(p5));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
