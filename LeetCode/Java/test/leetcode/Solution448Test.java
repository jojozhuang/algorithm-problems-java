/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.common.ListUtil;
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
public class Solution448Test {
    
    public Solution448Test() {
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
     * Test of findDisappearedNumbers method, of class Solution448.
     */
    @Test
    public void testFindDisappearedNumbers() {
        System.out.println("findDisappearedNumbers");
        int[] nums = null;
        Solution448 instance = new Solution448();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.findDisappearedNumbers(nums);
        assertEquals(expResult, result);
        
        List<Integer> expect2 = ListUtil.buildIntegerList(new Integer[]{5,6});
        assertEquals(expect2, instance.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        
        List<Integer> expect3 = ListUtil.buildIntegerList(new Integer[]{2});
        assertEquals(expect3, instance.findDisappearedNumbers(new int[]{1,1}));
        
        List<Integer> expect4 = ListUtil.buildIntegerList(new Integer[]{1});
        assertEquals(expect4, instance.findDisappearedNumbers(new int[]{2,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
