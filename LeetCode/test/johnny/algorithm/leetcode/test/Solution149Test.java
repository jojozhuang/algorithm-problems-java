/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Point[] points = null;
        Solution149 instance = new Solution149();
        int expResult = 0;
        int result = instance.maxPoints(points);
        assertEquals(expResult, result);
        
        Point[] points2 = new Point[5];
        points2[0] = new Point(1,2);
        points2[1] = new Point(3,2);
        points2[2] = new Point(2,2);
        points2[3] = new Point(1,9);        
        points2[4] = new Point(4,8);        
        assertEquals(3, instance.maxPoints(points2));
        
        Point[] points3 = new Point[1];
        points3[0] = new Point(0,0);
        assertEquals(1, instance.maxPoints(points3));
        
        Point[] points4 = new Point[2];
        points4[0] = new Point(0,0);
        points4[1] = new Point(0,0);
        assertEquals(2, instance.maxPoints(points4));
        
        Point[] points5 = new Point[5];
        points5[0] = new Point(1,1);
        points5[1] = new Point(1,2);
        points5[2] = new Point(2,2);
        points5[3] = new Point(2,3);        
        points5[4] = new Point(2,4);        
        assertEquals(3, instance.maxPoints(points5));
        
        Point[] points6 = new Point[3];
        points6[0] = new Point(2,3);
        points6[1] = new Point(3,3);
        points6[2] = new Point(-5,3);    
        assertEquals(3, instance.maxPoints(points6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
