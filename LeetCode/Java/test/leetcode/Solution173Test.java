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
public class Solution173Test {
    
    public Solution173Test() {
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
     * Test of hasNext method, of class Solution173.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        TreeNode root = null;
        Solution173 instance = new Solution173(root);
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);
        Solution173 instance1 = new Solution173(root1);
        assertEquals(true, instance1.hasNext());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Solution173.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        TreeNode root = new TreeNode(1);
        Solution173 instance = new Solution173(root);
        assertEquals(1, instance.next());
        
        TreeNode root1 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        Solution173 instance1 = new Solution173(root1);
        assertEquals(1, instance1.next());
        assertEquals(2, instance1.next());
        assertEquals(3, instance1.next());
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"4","2","#","1","3"});
        Solution173 instance2 = new Solution173(root2);
        assertEquals(1, instance2.next());
        assertEquals(2, instance2.next());
        assertEquals(3, instance2.next());
        assertEquals(4, instance2.next());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
