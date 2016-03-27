/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution016Test {
    
    public Solution016Test() {
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
     * Test of threeSumClosest method, of class Solution016.
     */
    @Test
    public void testThreeSumClosest() {
        System.out.println("threeSumClosest");
        int[] num = null;
        int target = 0;
        Solution016 instance = new Solution016();
        int expResult = 0;
        int result = instance.threeSumClosest(num, target);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.threeSumClosest(new int[]{-1,2,1,-4}, 1));
        assertEquals(2, instance.threeSumClosest(new int[]{-1,2,1,-4}, 2));
        assertEquals(-3, instance.threeSumClosest(new int[]{-1,2,1,-4}, -3));
        assertEquals(3, instance.threeSumClosest(new int[]{0,1,2}, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
