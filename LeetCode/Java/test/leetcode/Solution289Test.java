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
public class Solution289Test {
    
    public Solution289Test() {
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
     * Test of gameOfLife method, of class Solution289.
     */
    @Test
    public void testGameOfLife() {
        System.out.println("gameOfLife");
        int[][] board = null;
        Solution289 instance = new Solution289();
        instance.gameOfLife(board);
        
        int[][] board2 = new int[][]{ 
            {1,0,1}, 
            {1,0,1},
            {0,1,0}
        };
        int[][] expect2 = new int[][]{ 
            {0,0,0}, 
            {1,0,1},
            {0,1,0}
        };
        instance.gameOfLife(board2);
        assertArrayEquals(expect2, board2);
        
        int[][] board3 = new int[][]{ 
            {1}, 
            {0},
            {0},
            {1},
            {0},
            {0},
            {1},
            {0},
            {0},
            {1}
        };
        int[][] expect3 = new int[][]{ 
            {0}, 
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0},
            {0}
        };
        instance.gameOfLife(board3);
        assertArrayEquals(expect3, board3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
