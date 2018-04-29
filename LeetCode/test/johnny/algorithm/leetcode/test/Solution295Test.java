package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution295;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution295Test {
    
    public Solution295Test() {
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
     * Test of addNum method, of class Solution295.
     */
    @Test
    public void testAddNum() {
        System.out.println("addNum");
        int num = 0;
        Solution295 instance = new Solution295();
        instance.addNum(num);
    }

    /**
     * Test of findMedian method, of class Solution295.
     */
    @Test
    public void testFindMedian() {
        System.out.println("findMedian");
        Solution295 instance = new Solution295();
        instance.addNum(1);
        instance.addNum(2);        
        assertEquals(1.5, instance.findMedian(), 0.0);
        instance.addNum(3);
        assertEquals(2, instance.findMedian(), 0.0);
        
        Solution295 instance2 = new Solution295();
        instance2.addNum(6);
        assertEquals(6, instance2.findMedian(), 0.0);
        instance2.addNum(10);
        assertEquals(8, instance2.findMedian(), 0.0);
        instance2.addNum(2);
        assertEquals(6, instance2.findMedian(), 0.0);
        instance2.addNum(6);
        assertEquals(6, instance2.findMedian(), 0.0);
        instance2.addNum(5);
        assertEquals(6, instance2.findMedian(), 0.0);
        instance2.addNum(0);
        assertEquals(5.5, instance2.findMedian(), 0.0);
        instance2.addNum(6);
        assertEquals(6, instance2.findMedian(), 0.0);
        instance2.addNum(3);
        assertEquals(5.5, instance2.findMedian(), 0.0);
        instance2.addNum(1);
        assertEquals(5, instance2.findMedian(), 0.0);
        instance2.addNum(0);
        assertEquals(4, instance2.findMedian(), 0.0);
        instance2.addNum(0);
        assertEquals(3, instance2.findMedian(), 0.0);
    }
}
