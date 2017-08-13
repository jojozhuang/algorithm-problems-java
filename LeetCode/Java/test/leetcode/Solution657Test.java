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
public class Solution657Test {
    
    public Solution657Test() {
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
     * Test of judgeCircle method, of class Solution657.
     */
    @Test
    public void testJudgeCircle() {
        System.out.println("judgeCircle");
        String moves = "";
        Solution657 instance = new Solution657();
        boolean expResult = false;
        boolean result = instance.judgeCircle(moves);
        assertEquals(expResult, result);
        assertEquals(true, instance.judgeCircle("UD"));
        assertEquals(false, instance.judgeCircle("LL"));
        assertEquals(true, instance.judgeCircle("UDLR"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
