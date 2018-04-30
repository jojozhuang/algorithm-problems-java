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
        Solution095 instance = new Solution095();

        List<TreeNode> expect0 = new ArrayList<TreeNode>();
        assertEquals(expect0, instance.generateTrees(0));
        
        List<TreeNode> result1 = instance.generateTrees(1);
        List<TreeNode> expect1 = new ArrayList<TreeNode>();
        expect1.add(TreeNode.createInstance(new String[] {"1","#","#"}));
        for (int i = 0; i < result1.size(); i++) {
            assertTrue(TreeNode.isSame(expect1.get(i), result1.get(i)));
        }
        
        List<TreeNode> result2 = instance.generateTrees(2);
        List<TreeNode> expect2 = new ArrayList<TreeNode>();
        expect2.add(TreeNode.createInstance(new String[] {"1","#","2"}));
        expect2.add(TreeNode.createInstance(new String[] {"2","1","#"}));
        for (int i = 0; i < result2.size(); i++) {
            assertTrue(TreeNode.isSame(expect2.get(i), result2.get(i)));
        }
        
        List<TreeNode> result3 = instance.generateTrees(3);
        List<TreeNode> expect3 = new ArrayList<TreeNode>();
        expect3.add(TreeNode.createInstance(new String[] {"1","#","2","#","3"}));
        expect3.add(TreeNode.createInstance(new String[] {"1","#","3","2","#"}));
        expect3.add(TreeNode.createInstance(new String[] {"2","1","3","#","#","#","#"}));
        expect3.add(TreeNode.createInstance(new String[] {"3","1","#","#","2"}));
        expect3.add(TreeNode.createInstance(new String[] {"3","2","#","1","#"}));
        for (int i = 0; i < result3.size(); i++) {
            assertTrue(TreeNode.isSame(expect3.get(i), result3.get(i)));
        }
    }
}
