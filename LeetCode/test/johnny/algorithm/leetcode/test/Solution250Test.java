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

import johnny.algorithm.leetcode.Solution250;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution250Test {
    
    public Solution250Test() {
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
     * Test of countUnivalSubtrees method, of class Solution250.
     */
    @Test
    public void testCountUnivalSubtrees() {
        System.out.println("countUnivalSubtrees");
        TreeNode root = null;
        Solution250 instance = new Solution250();
        int expResult = 0;
        int result = instance.countUnivalSubtrees(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"5","1","5","5","5", "#","5"});
        assertEquals(4, instance.countUnivalSubtrees(root2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
