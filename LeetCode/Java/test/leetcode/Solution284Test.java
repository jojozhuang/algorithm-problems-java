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
public class Solution284Test {
    
    public Solution284Test() {
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
     * Test of peek method, of class Solution284.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        Solution284 instance = new Solution284(al.iterator());
        Integer result = 1;
        assertEquals(result, instance.peek());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Solution284.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        Solution284 instance = new Solution284(al.iterator());
        Integer result1 = 1;
        Integer result2 = 2;
        assertEquals(result1, instance.next());
        assertEquals(result2, instance.peek());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class Solution284.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");       
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        Solution284 instance = new Solution284(al.iterator());
        Integer result1 = 1;
        Integer result2 = 2;
        Integer result3 = 3;
        assertEquals(true, instance.hasNext());
        assertEquals(result1, instance.next());
        assertEquals(result2, instance.peek());
        assertEquals(true, instance.hasNext());
        assertEquals(result2, instance.next());
        assertEquals(result3, instance.next());
        assertEquals(false, instance.hasNext());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
