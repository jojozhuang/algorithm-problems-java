/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution054;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution054Test {
    
    public Solution054Test() {
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
     * Test of spiralOrder method, of class Solution054.
     */
    @Test
    public void testSpiralOrder() {
        System.out.println("spiralOrder");
        int[][] matrix = null;
        Solution054 instance = new Solution054();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.spiralOrder(matrix);
        assertEquals(expResult, result);
        
        assertEquals(expResult, instance.spiralOrder(new int[][]{}));        
        assertThat(instance.spiralOrder(new int[][]{{1,2,3}}), is(Arrays.asList(1,2,3)));
        assertThat(instance.spiralOrder(new int[][]{{4},{5},{6}}), is(Arrays.asList(4,5,6)));
        assertThat(instance.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8}}), is(Arrays.asList(1,2,3,4,8,7,6,5)));
        assertThat(instance.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}), is(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7)));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
