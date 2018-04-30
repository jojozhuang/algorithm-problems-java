package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution284;
import johnny.algorithm.leetcode.common.ListUtil;

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
        
        List<Integer> al = ListUtil.buildList(new Integer[] {1,2,3});
        Solution284 instance = new Solution284(al.iterator());
        Integer result = 1;
        assertEquals(result, instance.peek());
    }

    /**
     * Test of next method, of class Solution284.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        
        List<Integer> al = ListUtil.buildList(new Integer[] {1,2,3});
        Solution284 instance = new Solution284(al.iterator());
        Integer result1 = 1;
        Integer result2 = 2;
        assertEquals(result1, instance.next());
        assertEquals(result2, instance.peek());
    }

    /**
     * Test of hasNext method, of class Solution284.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        List<Integer> al = ListUtil.buildList(new Integer[] {1,2,3});
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
    }
}
