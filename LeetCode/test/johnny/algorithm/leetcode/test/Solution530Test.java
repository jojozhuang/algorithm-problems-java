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

import johnny.algorithm.leetcode.Solution530;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution530Test {
    
    public Solution530Test() {
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
     * Test of getMinimumDifference method, of class Solution530.
     */
    @Test
    public void testGetMinimumDifference() {
        System.out.println("getMinimumDifference");
        Solution530 instance = new Solution530();
        TreeNode r1 = TreeNode.createInstance(new String[] {"3"});
        assertEquals(Integer.MAX_VALUE, instance.getMinimumDifference(r1));
        
        TreeNode r2 = TreeNode.createInstance(new String[] {"9","3","20"});
        assertEquals(6, instance.getMinimumDifference(r2));
        
        TreeNode r3 = TreeNode.createInstance(new String[] {"1","#", "3", "2","#"});        
        assertEquals(1, instance.getMinimumDifference(r3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
