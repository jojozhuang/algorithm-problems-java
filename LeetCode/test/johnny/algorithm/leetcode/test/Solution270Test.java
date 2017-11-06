/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution270;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution270Test {
    
    public Solution270Test() {
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
     * Test of closestValue method, of class Solution270.
     */
    @Test
    public void testClosestValue() {
        System.out.println("closestValue");
        TreeNode root = null;
        double target = 0.0;
        Solution270 instance = new Solution270();
        int expResult = Integer.MAX_VALUE;
        int result = instance.closestValue(root, target);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"4"});
        assertEquals(4, instance.closestValue(root2, 3));
        assertEquals(4, instance.closestValue(root2, 5));
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"4","1","7"});
        assertEquals(7, instance.closestValue(root3, 6));
        assertEquals(1, instance.closestValue(root3, 2));
        assertEquals(4, instance.closestValue(root3, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
