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
        List<Integer> result = instance.getRow3(rowIndex);
        assertEquals(expResult, result);
        
        List<Integer> list1 = new ArrayList(); 
        list1.add(1);
        assertEquals(list1,  instance.getRow3(0));
        
        List<Integer> list2 = new ArrayList(); 
        list2.add(1);
        list2.add(1);
        assertEquals(list2,  instance.getRow3(1));

        List<Integer> list3 = new ArrayList(); 
        list3.add(1);
        list3.add(2);
        list3.add(1);
        assertEquals(list3,  instance.getRow3(2));

        List<Integer> list4 = new ArrayList(); 
        list4.add(1);
        list4.add(3);
        list4.add(3);
        list4.add(1);
        assertEquals(list4,  instance.getRow3(3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
