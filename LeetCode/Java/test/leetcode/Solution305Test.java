/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
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
public class Solution305Test {
    
    public Solution305Test() {
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
     * Test of numIslands2 method, of class Solution305.
     */
    @Test
    public void testNumIslands2() {
        System.out.println("numIslands2");
        int m = 0;
        int n = 0;
        int[][] positions = null;
        Solution305 instance = new Solution305();
        List<Integer> expResult = new ArrayList();
        List<Integer> result = instance.numIslands2(m, n, positions);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList();
        expResult2.add(1);
        expResult2.add(1);
        expResult2.add(2);
        expResult2.add(3);
        List<Integer> result2 = instance.numIslands2(3, 3, new int[][]{{0,0},{0,1},{1,2},{2,1}});
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
