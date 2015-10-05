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
public class Solution104Test {
    
    public Solution104Test() {
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
     * Test of maxDepth method, of class Solution104.
     */
    @Test
    public void testMaxDepth() {
        System.out.println("maxDepth");
        TreeNode root = null;
        Solution104 instance = new Solution104();
        int expResult = 0;
        int result = instance.maxDepth(root);
        assertEquals(expResult, result);

        TreeNode p1 = new TreeNode(1);
        assertEquals(1, instance.maxDepth(p1));

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        assertEquals(2, instance.maxDepth(p2));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(2);
        assertEquals(2, instance.maxDepth(p3));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(2);
        p4.right.left = new TreeNode(3);
        assertEquals(3, instance.maxDepth(p4));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        p5.right = new TreeNode(2);
        p5.right.right = new TreeNode(3);
        p5.right.right.right = new TreeNode(4);
        assertEquals(4, instance.maxDepth(p5));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
