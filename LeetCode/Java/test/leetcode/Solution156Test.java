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
public class Solution156Test {
    
    public Solution156Test() {
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
     * Test of upsideDownBinaryTree method, of class Solution156.
     */
    @Test
    public void testUpsideDownBinaryTree() {
        System.out.println("upsideDownBinaryTree");
        TreeNode root = null;
        Solution156 instance = new Solution156();
        TreeNode expResult = null;
        TreeNode result = instance.upsideDownBinaryTree(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2", "3","4","5"});
        TreeNode result2 = instance.upsideDownBinaryTree(root2);
        assertEquals(4, result2.val);
        assertEquals(5, result2.left.val);
        assertEquals(2, result2.right.val);
        assertEquals(3, result2.right.left.val);
        assertEquals(1, result2.right.right.val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
