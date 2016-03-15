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
public class Solution307Test {
    
    public Solution307Test() {
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
     * Test of update method, of class Solution307.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int i = 0;
        int val = 0;
        Solution307 instance = new Solution307(new int[]{});
        instance.update(i, val);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumRange method, of class Solution307.
     */
    @Test
    public void testSumRange() {
        System.out.println("sumRange");
        int i = 0;
        int j = 0;
        Solution307 instance = new Solution307(new int[]{});
        int expResult = 0;
        int result = instance.sumRange(i, j);
        assertEquals(expResult, result);
        
        Solution307 instance2 = new Solution307(new int[]{1});
        assertEquals(1, instance2.sumRange(0, 0));
        assertEquals(0, instance2.sumRange(0, 1));
        
        Solution307 instance3 = new Solution307(new int[]{1,2,3,4,5});
        assertEquals(3, instance3.sumRange(0, 1));
        assertEquals(6, instance3.sumRange(0, 2));
        assertEquals(9, instance3.sumRange(3, 4));
        
        Solution307 instance4 = new Solution307(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, instance4.sumRange(0, 2));
        assertEquals(-1, instance4.sumRange(2, 5));
        assertEquals(-3, instance4.sumRange(0, 5));
        
        Solution307 instance5 = new Solution307(new int[]{1,3,5});
        assertEquals(9, instance5.sumRange(0, 2));
        instance5.update(1, 2);
        assertEquals(8, instance5.sumRange(0, 2));
        instance5.update(1, -2);
        assertEquals(-1, instance5.sumRange(0, 1));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
