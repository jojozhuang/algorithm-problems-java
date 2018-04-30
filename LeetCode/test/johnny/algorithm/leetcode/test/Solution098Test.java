package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution098;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution098Test {
    
    public Solution098Test() {
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
     * Test of isValidBST method, of class Solution098.
     */
    @Test
    public void testIsValidBST() {
        System.out.println("isValidBST");
        TreeNode root = null;
        Solution098 instance = new Solution098();
        boolean expResult = true;
        boolean result = instance.isValidBST(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(false, instance.isValidBST(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","#","2","#","3"});
        assertEquals(true, instance.isValidBST(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(true, instance.isValidBST(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","#","3","2","#"});
        assertEquals(true, instance.isValidBST(root5));
        
        TreeNode root6 = TreeNode.createInstance(new String[] {"10","5","15","#","#","6","20"});
        assertEquals(false, instance.isValidBST(root6));
        
        TreeNode root7 = TreeNode.createInstance(new String[] {"1","1","#"});
        assertEquals(false, instance.isValidBST(root7));
        
        TreeNode root8 = TreeNode.createInstance(new String[] {Integer.MIN_VALUE + "", "#", Integer.MAX_VALUE + ""});
        assertEquals(true, instance.isValidBST(root8));
        
        TreeNode root9 = TreeNode.createInstance(new String[] {Integer.MAX_VALUE + "", Integer.MAX_VALUE + "", "#"}); 
        assertEquals(false, instance.isValidBST(root9));
        
        TreeNode root10 = TreeNode.createInstance(new String[] {Integer.MIN_VALUE + "", "#", Integer.MIN_VALUE + ""}); 
        assertEquals(false, instance.isValidBST(root10));
    }
}
