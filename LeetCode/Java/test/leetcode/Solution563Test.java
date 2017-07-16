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
public class Solution563Test {
    
    public Solution563Test() {
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
     * Test of findTilt method, of class Solution563.
     */
    @Test
    public void testFindTilt() {
        System.out.println("findTilt");
        Solution563 instance = new Solution563();
        
        TreeNode r1 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(0, instance.findTilt(r1));
        
        TreeNode r2 = TreeNode.createInstance(new String[] {"1","#", "3"});
        assertEquals(3, instance.findTilt(r2));
        
        TreeNode r3 = TreeNode.createInstance(new String[] {"1","2", "3"});
        assertEquals(1, instance.findTilt(r3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
