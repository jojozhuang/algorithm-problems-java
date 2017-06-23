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
public class Solution551Test {
    
    public Solution551Test() {
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
     * Test of checkRecord method, of class Solution551.
     */
    @Test
    public void testCheckRecord() {
        System.out.println("checkRecord");
        Solution551 instance = new Solution551();
        assertEquals(false, instance.checkRecord(""));
        assertEquals(true, instance.checkRecord("A"));
        assertEquals(true, instance.checkRecord("AL"));
        assertEquals(true, instance.checkRecord("ALL"));
        assertEquals(false, instance.checkRecord("ALLL"));
        assertEquals(false, instance.checkRecord("LPAAL"));
        assertEquals(true, instance.checkRecord("APLPL"));
        assertEquals(true, instance.checkRecord("PPALLP"));
        assertEquals(false, instance.checkRecord("PPALLL"));
        assertEquals(false, instance.checkRecord("PPALLA"));
        assertEquals(true, instance.checkRecord("PPALPLPL"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
