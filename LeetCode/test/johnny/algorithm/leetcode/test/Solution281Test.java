package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution281;
import johnny.algorithm.leetcode.common.ListUtil;

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
        System.out.println("ZigzagIterator");
        
        List<Integer> v11 = ListUtil.buildList(new Integer[] {1,2}); 
        List<Integer> v12 = ListUtil.buildList(new Integer[] {3, 4, 5, 6});
        //List<Integer> expect1 = ListUtil.buildList(new Integer[] {1, 3, 2, 4, 5, 6}); 
        Solution281 instance = new Solution281(v11, v12);
        
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
        
        List<List<Integer>> klist1 = ListUtil.buildList2(new Integer[][] {{1,2,3},{4,5,6,7},{8,9}});
        //List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,4,8,2,5,9,3,6,7}); 
        Solution281.KList instance2 = instance.new KList(klist1);

        assertEquals(true, instance2.hasNext());
        assertEquals(1, instance2.next());
        assertEquals(4, instance2.next());
        assertEquals(8, instance2.next());
        assertEquals(2, instance2.next());
        assertEquals(5, instance2.next());
        assertEquals(9, instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(3, instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(6, instance2.next());
        assertEquals(7, instance2.next());
        assertEquals(false, instance2.hasNext());
    }

    
    
}
