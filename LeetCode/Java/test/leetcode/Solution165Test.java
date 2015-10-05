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
public class Solution165Test {
    
    public Solution165Test() {
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
     * Test of compareVersion method, of class Solution165.
     */
    @Test
    public void testCompareVersion() {
        System.out.println("compareVersion");
        String version1 = "";
        String version2 = "";
        Solution165 instance = new Solution165();
        int expResult = 0;
        //int result = instance.compareVersion(version1, version2);
        //assertEquals(expResult, result);
        
        assertEquals(0, instance.compareVersion("1.0", "1"));
        assertEquals(0, instance.compareVersion("1.1", "1.1.0.00."));
        assertEquals(-1, instance.compareVersion("0.1", "0.11"));
        assertEquals(-1, instance.compareVersion("0.2", "0.15"));
        assertEquals(0, instance.compareVersion("1.2", "1.2"));
        assertEquals(1, instance.compareVersion("1.1", "1.0.1"));
        assertEquals(-1, instance.compareVersion("1.0", "1.0.1"));
        assertEquals(1, instance.compareVersion("2.333333", "2.333332"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
