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
public class Solution606Test {
    
    public Solution606Test() {
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
     * Test of tree2str method, of class Solution606.
     */
    @Test
    public void testTree2str() {
        System.out.println("tree2str");        
        Solution606 instance = new Solution606();

        assertEquals("", instance.tree2str(null));
        
        TreeNode t1 = TreeNode.CreateInstance(new String[] {"1"});
        assertEquals("1", instance.tree2str(t1));
        
        TreeNode t2 = TreeNode.CreateInstance(new String[] {"1","2","3"});
        assertEquals("1(2)(3)", instance.tree2str(t2));
        
        TreeNode t3 = TreeNode.CreateInstance(new String[] {"1","#","3"});
        assertEquals("1()(3)", instance.tree2str(t3));
        
        TreeNode t4 = TreeNode.CreateInstance(new String[] {"1","2","#"});
        assertEquals("1(2)", instance.tree2str(t4));
        
        TreeNode t5 = TreeNode.CreateInstance(new String[] {"1","2","3","4","#"});
        assertEquals("1(2(4))(3)", instance.tree2str(t5));
        
        TreeNode t6 = TreeNode.CreateInstance(new String[] {"1","2","3","#","4"});
        assertEquals("1(2()(4))(3)", instance.tree2str(t6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
