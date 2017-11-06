/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution163;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution163Test {
    
    public Solution163Test() {
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
     * Test of findMissingRanges method, of class Solution163.
     */
    @Test
    public void testFindMissingRanges() {
        System.out.println("findMissingRanges");
        int[] nums = null;
        int lower = 0;
        int upper = 0;
        Solution163 instance = new Solution163();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.findMissingRanges(nums, lower, upper);
        assertEquals(expResult, result);
        
        List<String> result2 = instance.findMissingRanges(new int[]{1,2}, 1, 2);
        List<String> expResult2 = new ArrayList<String>();
        assertEquals(expResult2, result2);
        
        List<String> result3 = instance.findMissingRanges(new int[]{1,2}, 0, 3);
        List<String> expResult3 = ListUtil.buildStringList(new String[]{"0","3"});
        assertEquals(expResult3, result3);
        
        List<String> result4 = instance.findMissingRanges(new int[]{1,2}, 1, 4);
        List<String> expResult4 = ListUtil.buildStringList(new String[]{"3->4"});
        assertEquals(expResult4, result4);
        
        List<String> result5 = instance.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
        List<String> expResult5 = ListUtil.buildStringList(new String[]{"2","4->49","51->74","76->99"});
        assertEquals(expResult5, result5);
        
        List<String> result6 = instance.findMissingRanges(new int[]{3, 50, 75}, 0, 99);
        List<String> expResult6 = ListUtil.buildStringList(new String[]{"0->2","4->49","51->74","76->99"});
        assertEquals(expResult6, result6);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
