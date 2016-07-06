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
public class Solution333Test {
    
    public Solution333Test() {
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
     * Test of largestBSTSubtree method, of class Solution333.
     */
    @Test
    public void testLargestBSTSubtree() {
        System.out.println("largestBSTSubtree");
        TreeNode root = null;
        Solution333 instance = new Solution333();
        int expResult = 0;
        int result = instance.largestBSTSubtree(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.CreateInstance(new String[]{"10","5","15","1","8","#","7"});
        assertEquals(3, instance.largestBSTSubtree(root2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
