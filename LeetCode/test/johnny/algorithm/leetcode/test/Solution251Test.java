package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution251;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution251Test {
    
    public Solution251Test() {
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
     * Test of next method, of class Solution251.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        List<List<Integer>> v2d1 = new ArrayList<List<Integer>>();
        List<Integer> list11 = new ArrayList<Integer>();
        list11.add(1);
        list11.add(2);
        List<Integer> list12 = new ArrayList<Integer>();
        list12.add(3);
        List<Integer> list13 = new ArrayList<Integer>();
        list13.add(4);
        list13.add(5);
        list13.add(6);
        v2d1.add(list11);
        v2d1.add(list12);
        v2d1.add(list13);        
        Solution251 instance = new Solution251(v2d1);
        int[] expResult1 = new int[]{1,2,3,4,5,6};
        int[] result1 = new int[6];
        int i = 0;
        while (instance.hasNext()) {
            result1[i] = instance.next();
            i++;
        }
        assertArrayEquals(expResult1, result1);
    }
}
