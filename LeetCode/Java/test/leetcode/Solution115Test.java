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
public class Solution115Test {
    
    public Solution115Test() {
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
     * Test of numDistinct method, of class Solution115.
     */
    @Test
    public void testNumDistinct() {
        System.out.println("numDistinct");
        String S = "";
        String T = null;
        Solution115 instance = new Solution115();
        int expResult = 0;
        int result = instance.numDistinct(S, T);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.numDistinct("a", ""));
        assertEquals(1, instance.numDistinct("ab", "a"));
        assertEquals(2, instance.numDistinct("aa", "a"));
        assertEquals(1, instance.numDistinct("abc", "ab"));
        assertEquals(2, instance.numDistinct("abad", "ad"));
        assertEquals(3, instance.numDistinct("rabbbit", "rabbit"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
