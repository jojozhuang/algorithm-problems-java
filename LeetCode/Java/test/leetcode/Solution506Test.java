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
public class Solution506Test {
    
    public Solution506Test() {
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
     * Test of findRelativeRanks method, of class Solution506.
     */
    @Test
    public void testFindRelativeRanks() {
        System.out.println("findRelativeRanks");
        Solution506 instance = new Solution506();
        assertArrayEquals(new String[]{}, instance.findRelativeRanks(new int[]{}));
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal"}, instance.findRelativeRanks(new int[]{2,1}));
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, instance.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new String[]{"Bronze Medal", "4", "5", "Silver Medal", "Gold Medal" }, instance.findRelativeRanks(new int[]{3,2,1,4,5}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
