package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution272;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution272Test {
    
    public Solution272Test() {
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
     * Test of closestKValues method, of class Solution272.
     */
    @Test
    public void testClosestKValues() {
        System.out.println("closestKValues");
        TreeNode root = null;
        double target = 0.0;
        int k = 0;
        Solution272 instance = new Solution272();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.closestKValues(root, target, k);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[] {"4"});
        List<Integer> result2 = instance.closestKValues(root2, 4, 1);
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(4);
        assertTrue(expResult2.containsAll(result2)&&result2.containsAll(expResult2));
        
        TreeNode root3 = TreeNode.createInstance(new String[] {"4","1","7"});
        List<Integer> result31 = instance.closestKValues(root3, 6, 1);
        List<Integer> expResult31 = new ArrayList<Integer>();
        expResult31.add(7);
        assertTrue(expResult31.containsAll(result31)&&result31.containsAll(expResult31));
        
        List<Integer> result32 = instance.closestKValues(root3, 2, 1);
        List<Integer> expResult32 = new ArrayList<Integer>();
        expResult32.add(1);
        assertTrue(expResult32.containsAll(result32)&&result32.containsAll(expResult32));
        
        List<Integer> result33 = instance.closestKValues(root3, 3, 1);
        List<Integer> expResult33 = new ArrayList<Integer>();
        expResult33.add(4);
        assertTrue(expResult33.containsAll(result33)&&result33.containsAll(expResult33));
        
        List<Integer> result34 = instance.closestKValues(root3, 6, 2);
        List<Integer> expResult34 = new ArrayList<Integer>();
        expResult34.add(4);
        expResult34.add(7);
        assertTrue(expResult34.containsAll(result34)&&result34.containsAll(expResult34));
        
        List<Integer> result35 = instance.closestKValues(root3, 2, 2);
        List<Integer> expResult35 = new ArrayList<Integer>();
        expResult35.add(1);
        expResult35.add(4);
        assertTrue(expResult35.containsAll(result35)&&result35.containsAll(expResult35));
        
        List<Integer> result36 = instance.closestKValues(root3, 3, 2);
        List<Integer> expResult36 = new ArrayList<Integer>();
        expResult36.add(1);
        expResult36.add(4);
        assertTrue(expResult36.containsAll(result36)&&result36.containsAll(expResult36));
        
        List<Integer> result37 = instance.closestKValues(root3, 3, 3);
        List<Integer> expResult37 = new ArrayList<Integer>();
        expResult37.add(1);
        expResult37.add(4);
        expResult37.add(7);
        assertTrue(expResult37.containsAll(result37)&&result37.containsAll(expResult37));
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
