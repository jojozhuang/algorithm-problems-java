/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.ListNode;
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
public class Solution109Test {
    
    public Solution109Test() {
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
     * Test of sortedListToBST method, of class Solution109.
     */
    @Test
    public void testSortedListToBST() {
        System.out.println("sortedListToBST");
        Solution109 instance = new Solution109();

        assertEquals(null, instance.sortedListToBST(null));
        
        ListNode head2 = ListNode.createInstance(new int[]{1,2});
        TreeNode expect2 = TreeNode.createInstance(new String[] {"2","1","#"});
        assertTrue(TreeNode.isSame(expect2, instance.sortedListToBST(head2)));
        
        ListNode head3 = ListNode.createInstance(new int[]{1,2,3});
        TreeNode expect3 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertTrue(TreeNode.isSame(expect3, instance.sortedListToBST(head3)));
       
        ListNode head4 = ListNode.createInstance(new int[]{1,2,3,4,5,6,7,8,9});
        TreeNode expect4 = TreeNode.createInstance(new String[] {"5","3","8","2","4","7","9","1","#","#","#","6","#"});
        assertTrue(TreeNode.isSame(expect4, instance.sortedListToBST(head4)));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
