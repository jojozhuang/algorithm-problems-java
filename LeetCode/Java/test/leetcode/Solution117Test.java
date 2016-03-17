/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeLinkNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RZHUANG
 */
public class Solution117Test {
    
    public Solution117Test() {
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
     * Test of connect method, of class Solution117.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        TreeLinkNode root = null;
        Solution117 instance = new Solution117();
        instance.connect(root);
        
        TreeLinkNode root3 = TreeLinkNode.CreateInstance(new String[] {"1","2","3","4","5","#","7"});
        instance.connect(root3);
        assertEquals(null, root3.next);
        assertEquals(3, root3.left.next.val);
        assertEquals(null, root3.right.next);
        assertEquals(5, root3.left.left.next.val);
        assertEquals(7, root3.left.right.next.val);
        assertEquals(null, root3.right.left);
        assertEquals(null, root3.right.right.next);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
