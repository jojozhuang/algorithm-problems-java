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
 * @author i857285
 */
public class Solution572Test {
    
    public Solution572Test() {
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
     * Test of isSubtree method, of class Solution572.
     */
    @Test
    public void testIsSubtree() {
        System.out.println("isSubtree");
        Solution572 instance = new Solution572();
        
        TreeNode s1 = TreeNode.CreateInstance(new String[] {"1"});
        TreeNode t1 = TreeNode.CreateInstance(new String[] {"1"});
        assertEquals(true, instance.isSubtree(s1, t1));
        
        TreeNode s2 = TreeNode.CreateInstance(new String[] {"1","2","#"});
        TreeNode t2 = TreeNode.CreateInstance(new String[] {"1"});
        assertEquals(false, instance.isSubtree(s2, t2));
        
        TreeNode s3 = TreeNode.CreateInstance(new String[] {"1","2","#"});
        TreeNode t3 = TreeNode.CreateInstance(new String[] {"2"});
        assertEquals(true, instance.isSubtree(s3, t3));
        
        TreeNode s4 = TreeNode.CreateInstance(new String[] {"1","2","#"});
        TreeNode t4 = TreeNode.CreateInstance(new String[] {"3"});
        assertEquals(false, instance.isSubtree(s4, t4));
        
        TreeNode s5 = TreeNode.CreateInstance(new String[] {"3","4","5","1","2","#","#"});
        TreeNode t5 = TreeNode.CreateInstance(new String[] {"4","1","2"});
        assertEquals(true, instance.isSubtree(s5, t5));
        
        TreeNode s6 = TreeNode.CreateInstance(new String[] {"3","4","5","1","2","#","#","#","#","0","#"});
        TreeNode t6 = TreeNode.CreateInstance(new String[] {"4","1","2"});
        assertEquals(false, instance.isSubtree(s6, t6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
