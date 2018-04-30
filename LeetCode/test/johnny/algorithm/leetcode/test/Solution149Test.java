package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution149;
import johnny.algorithm.leetcode.common.Point;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution149Test {
    
    public Solution149Test() {
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
     * Test of maxPoints method, of class Solution149.
     */
    @Test
    public void testMaxPoints() {
        System.out.println("maxPoints");
        Solution149 instance = new Solution149();

        assertEquals(0, instance.maxPoints(null));
        
        Point[] points2 = Point.buildArray(new int[][] {{1,2},{3,2},{2,2},{1,9},{4,8}});
        assertEquals(3, instance.maxPoints(points2));
        
        Point[] points3 = Point.buildArray(new int[][] {{0,0}});
        assertEquals(1, instance.maxPoints(points3));
        
        Point[] points4 = Point.buildArray(new int[][] {{0,0},{0,0}});
        assertEquals(2, instance.maxPoints(points4));
        
        Point[] points5 = Point.buildArray(new int[][] {{1,1},{1,2},{2,2},{2,3},{2,8}});
        assertEquals(3, instance.maxPoints(points5));
        
        Point[] points6 = Point.buildArray(new int[][] {{2,3},{3,3},{-5,3}});
        assertEquals(3, instance.maxPoints(points6));
    }
}
