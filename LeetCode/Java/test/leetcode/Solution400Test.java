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
 * @author i857285
 */
public class Solution400Test {
    
    public Solution400Test() {
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
     * Test of findNthDigit method, of class Solution400.
     */
    @Test
    public void testFindNthDigit() {
        System.out.println("findNthDigit");
        Solution400 instance = new Solution400();
        //assertEquals(1, instance.findNthDigit(1));
        //assertEquals(9, instance.findNthDigit(9));
        //assertEquals(1, instance.findNthDigit(10));
        //assertEquals(0, instance.findNthDigit(11));
        //assertEquals(1, instance.findNthDigit(12));
        //assertEquals(1, instance.findNthDigit(13));
        assertEquals(1, instance.findNthDigit(1000000000));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
