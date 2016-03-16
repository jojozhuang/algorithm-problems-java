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
 * @author RZHUANG
 */
public class Solution174Test {
    
    public Solution174Test() {
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
     * Test of calculateMinimumHP method, of class Solution174.
     */
    @Test
    public void testCalculateMinimumHP() {
        System.out.println("calculateMinimumHP");
        int[][] dungeon = null;
        Solution174 instance = new Solution174();
        int expResult = 0;
        int result = instance.calculateMinimumHP(dungeon);
        assertEquals(expResult, result);
        
        int[][] dungeon2 = new int[][] {
            {-2,-3,3},
            {-5,-10,1},
            {10,30,-5},
        };
        assertEquals(7, instance.calculateMinimumHP(dungeon2));
        
        int[][] dungeon3 = new int[][] {
            {1,1,1},
            {1,1,1},
            {1,1,1},
        };
        assertEquals(1, instance.calculateMinimumHP(dungeon3));
        
        int[][] dungeon4 = new int[][] {
            {-200},
        };
        assertEquals(201, instance.calculateMinimumHP(dungeon4));
        
        int[][] dungeon5 = new int[][] {
            {-3},
            {1}
        };
        assertEquals(4, instance.calculateMinimumHP(dungeon5));
        
        int[][] dungeon6 = new int[][] {
            {2,-6}
        };
        assertEquals(5, instance.calculateMinimumHP(dungeon6));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
