package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution281;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution281Test {
    
    public Solution281Test() {
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
     * Test of next method, of class Solution281.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6); 
        List<List<Integer>> klist1 = new ArrayList<List<Integer>>();
        klist1.add(list1);
        klist1.add(list2);
        Solution281 instance = new Solution281(klist1);
        assertEquals(true, instance.hasNext());
        assertEquals(1, instance.next());
        assertEquals(3, instance.next());
        assertEquals(2, instance.next());
        assertEquals(4, instance.next());
        assertEquals(true, instance.hasNext());
        assertEquals(5, instance.next());
        assertEquals(true, instance.hasNext());
        assertEquals(6, instance.next());
        assertEquals(false, instance.hasNext());
        
        List<Integer> list21 = new ArrayList<Integer>();
        list21.add(1);
        list21.add(2);
        List<Integer> list22 = new ArrayList<Integer>();
        list22.add(3);
        list22.add(4);
        list22.add(5);
        list22.add(6); 
        List<Integer> list23 = new ArrayList<Integer>();
        list23.add(7);
        list23.add(8);
        list23.add(9);
        List<List<Integer>> klist2 = new ArrayList<List<Integer>>();
        klist2.add(list21);
        klist2.add(list22);
        klist2.add(list23);
        Solution281 instance2 = new Solution281(klist2);
        assertEquals(true, instance2.hasNext());
        assertEquals(1, instance2.next());
        assertEquals(3, instance2.next());
        assertEquals(7, instance2.next());
        assertEquals(2, instance2.next());
        assertEquals(4, instance2.next());
        assertEquals(8, instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(5, instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(9, instance2.next());
        assertEquals(6, instance2.next());
        assertEquals(false, instance2.hasNext());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
