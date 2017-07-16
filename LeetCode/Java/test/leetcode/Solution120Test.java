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
 * @author Johnny
 */
public class Solution120Test {
    
    public Solution120Test() {
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
     * Test of minimumTotal method, of class Solution120.
     */
    @Test
    public void testMinimumTotal() {
        System.out.println("minimumTotal");
        Solution120 instance = new Solution120();

        assertEquals(0, instance.minimumTotal(null));
        
        List<List<Integer>> triangle1 = ListUtil.buildDoubleIntegerList(new Integer[][]{{1}});
        assertEquals(1, instance.minimumTotal(triangle1));
        
        List<List<Integer>> triangle2 = ListUtil.buildDoubleIntegerList(new Integer[][]{{1},{2,3}});
        assertEquals(3, instance.minimumTotal(triangle2));
   
        List<List<Integer>> triangle3 = ListUtil.buildDoubleIntegerList(new Integer[][]{{2},{3,4},{6,5,7},{4,1,8,3}});
        assertEquals(11, instance.minimumTotal(triangle3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
