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

import johnny.algorithm.leetcode.Solution118;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution118Test {
    
    public Solution118Test() {
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
     * Test of generate method, of class Solution118.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        int numRows = 0;
        Solution118 instance = new Solution118();
        List<List<Integer>> expResult = new ArrayList();
        List<List<Integer>> result = instance.generate(numRows);
        assertEquals(expResult, result);
        
        List<List<Integer>> expect1 = ListUtil.buildIntegerList2(new Integer[][]{{1}});
        assertEquals(expect1,  instance.generate(1));
        
        List<List<Integer>> expect2 = ListUtil.buildIntegerList2(new Integer[][]{{1},{1,1}});
        assertEquals(expect2,  instance.generate(2));

        List<List<Integer>> expect3 = ListUtil.buildIntegerList2(new Integer[][]{{1},{1,1},{1,2,1}});
        assertEquals(expect3,  instance.generate(3));

        List<List<Integer>> expect4 = ListUtil.buildIntegerList2(new Integer[][]{{1},{1,1},{1,2,1},{1,3,3,1}});
        assertEquals(expect4,  instance.generate(4));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
