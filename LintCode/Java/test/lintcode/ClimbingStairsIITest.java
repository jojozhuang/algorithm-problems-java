/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

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
public class ClimbingStairsIITest {
    
    public ClimbingStairsIITest() {
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
     * Test of climbStairs2 method, of class ClimbingStairsII.
     */
    @Test
    public void testClimbStairs2() {
        System.out.println("climbStairs2");
        ClimbingStairsII instance = new ClimbingStairsII();
        assertEquals(1, instance.climbStairs2(0));
        assertEquals(1, instance.climbStairs2(1));
        assertEquals(2, instance.climbStairs2(2));
        assertEquals(4, instance.climbStairs2(3));
        assertEquals(7, instance.climbStairs2(4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
