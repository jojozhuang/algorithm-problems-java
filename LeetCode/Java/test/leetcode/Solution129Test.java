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
public class Solution129Test {
    
    public Solution129Test() {
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
     * Test of sumNumbers method, of class Solution129.
     */
    @Test
    public void testSumNumbers() {
        System.out.println("sumNumbers");
        TreeNode root = null;
        Solution129 instance = new Solution129();
        int expResult = 0;
        int result = instance.sumNumbers(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2", "#"});
        assertEquals(12, instance.sumNumbers(root2));
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2", "3"});
        assertEquals(25, instance.sumNumbers(root3));
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2", "3", "#","#","#","5"});
        assertEquals(147, instance.sumNumbers(root4));
        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2", "3", "#","#","4","5"});
        assertEquals(281, instance.sumNumbers(root5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
