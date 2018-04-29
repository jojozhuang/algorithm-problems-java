package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution095;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution095Test {
    
    public Solution095Test() {
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
     * Test of generateTrees method, of class Solution095.
     */
    @Test
    public void testGenerateTrees() {
        System.out.println("generateTrees");
        int n = 0;
        Solution095 instance = new Solution095();
        List<TreeNode> expResult = new ArrayList<TreeNode>();
        List<TreeNode> result = instance.generateTrees(n);
        assertEquals(expResult, result);
        
        List<TreeNode> result2 = instance.generateTrees(1);
        assertEquals(1, result2.get(0).val);
        
        List<TreeNode> result3 = instance.generateTrees(2);
        assertEquals(1, result3.get(0).val);
        assertEquals(2, result3.get(0).right.val);
        assertEquals(2, result3.get(1).val);
        assertEquals(1, result3.get(1).left.val);
        
        List<TreeNode> result4 = instance.generateTrees(3);
        assertEquals(1, result4.get(0).val);
        assertEquals(2, result4.get(0).right.val);
        assertEquals(3, result4.get(0).right.right.val);
        assertEquals(1, result4.get(1).val);
        assertEquals(3, result4.get(1).right.val);
        assertEquals(2, result4.get(1).right.left.val);
        assertEquals(2, result4.get(2).val);
        assertEquals(1, result4.get(2).left.val);
        assertEquals(3, result4.get(2).right.val);
        assertEquals(3, result4.get(3).val);
        assertEquals(1, result4.get(3).left.val);
        assertEquals(2, result4.get(3).left.right.val);
        assertEquals(3, result4.get(4).val);
        assertEquals(2, result4.get(4).left.val);
        assertEquals(1, result4.get(4).left.left.val);
    }
}
