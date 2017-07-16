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
public class Solution414Test {
    
    public Solution414Test() {
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
     * Test of thirdMax method, of class Solution414.
     */
    @Test
    public void testThirdMax() {
        System.out.println("thirdMax");
        Solution414 instance = new Solution414();
        assertEquals(2, instance.thirdMax(new int[]{1,2,2,5,3,5}));
        assertEquals(0, instance.thirdMax(new int[]{}));
        assertEquals(1, instance.thirdMax(new int[]{1}));
        assertEquals(1, instance.thirdMax(new int[]{2,1,3}));
        assertEquals(1, instance.thirdMax(new int[]{3,2,1}));
        assertEquals(2, instance.thirdMax(new int[]{1,2}));
        assertEquals(1, instance.thirdMax(new int[]{2,2,3,1}));
        assertEquals(-2147483648, instance.thirdMax(new int[]{-2147483648}));
        assertEquals(-2147483648, instance.thirdMax(new int[]{-2147483648,1,2}));
        assertEquals(1, instance.thirdMax(new int[]{-2147483648,1,1}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
