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
public class Solution230Test {
    
    public Solution230Test() {
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
     * Test of kthSmallest method, of class Solution230.
     */
    @Test
    public void testKthSmallest() {
        System.out.println("kthSmallest");
        TreeNode root = null;
        int k = 0;
        Solution230 instance = new Solution230();
        int expResult = 0;
        int result = instance.kthSmallest(root, k);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.CreateInstance(new String[] {"2","1", "#"});
        assertEquals(1, instance.kthSmallest(root2, 1));
        assertEquals(2, instance.kthSmallest(root2, 2));
        
        TreeNode root3 = TreeNode.CreateInstance(new String[] {"4","2","7","#", "3", "5", "#","#","#","#","6","#","#"});
        assertEquals(2, instance.kthSmallest(root3, 1));
        assertEquals(3, instance.kthSmallest(root3, 2));
        assertEquals(4, instance.kthSmallest(root3, 3));
        assertEquals(5, instance.kthSmallest(root3, 4));
        assertEquals(6, instance.kthSmallest(root3, 5));
        assertEquals(7, instance.kthSmallest(root3, 6));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
