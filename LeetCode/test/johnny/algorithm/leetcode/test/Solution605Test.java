package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution605;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution605Test {
    
    public Solution605Test() {
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
     * Test of canPlaceFlowers method, of class Solution605.
     */
    @Test
    public void testCanPlaceFlowers() {
        System.out.println("canPlaceFlowers");
        Solution605 instance = new Solution605();
        
        assertEquals(false, instance.canPlaceFlowers(null, 0));
        assertEquals(true, instance.canPlaceFlowers(new int[]{0}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0}, 2));
        assertEquals(false, instance.canPlaceFlowers(new int[]{1}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0,1}, 1));
        assertEquals(true, instance.canPlaceFlowers(new int[]{0,0}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{0,0}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0}, 1));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertEquals(false, instance.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertEquals(true, instance.canPlaceFlowers(new int[]{1,0,0,0,0,0,1}, 2));
    }
}
