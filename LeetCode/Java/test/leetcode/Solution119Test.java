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
public class Solution119Test {
    
    public Solution119Test() {
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
     * Test of getRow method, of class Solution119.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        int rowIndex = -1;
        Solution119 instance = new Solution119();
        List<Integer> expResult = new ArrayList();
        expResult.add(1);
        List<Integer> result = instance.getRow(rowIndex);
        assertEquals(expResult, result);
        
        List<Integer> expect1 = ListUtil.buildIntegerList(new Integer[]{1});
        assertEquals(expect1,  instance.getRow(0));
        
        List<Integer> expect2 = ListUtil.buildIntegerList(new Integer[]{1,1});
        assertEquals(expect2,  instance.getRow(1));

        List<Integer> expect3 = ListUtil.buildIntegerList(new Integer[]{1,2,1});
        assertEquals(expect3,  instance.getRow(2));

        List<Integer> expect4 = ListUtil.buildIntegerList(new Integer[]{1,3,3,1});
        assertEquals(expect4,  instance.getRow(3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
