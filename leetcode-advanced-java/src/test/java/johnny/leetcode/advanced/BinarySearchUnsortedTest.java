package johnny.leetcode.advanced;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.leetcode.advanced.BinarySearchUnsorted;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class BinarySearchUnsortedTest {
    
    public BinarySearchUnsortedTest() {
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
     * Test of drop method, of class Zume.
     */
    @Test
    public void testSearch() {
        System.out.println("Binary search in unsorted array");
        BinarySearchUnsorted instance = new BinarySearchUnsorted();

        assertArrayEquals(new int[] {}, instance.search(new int[]{}));
        assertArrayEquals(new int[] {}, instance.search(new int[]{1}));
        assertArrayEquals(new int[] {}, instance.search(new int[]{1,2}));
        assertArrayEquals(new int[] {1}, instance.search(new int[]{2,1}));
        assertArrayEquals(new int[] {}, instance.search(new int[]{1,2,3}));
        assertArrayEquals(new int[] {3,1}, instance.search(new int[]{3,2,1}));
        assertArrayEquals(new int[] {1}, instance.search(new int[]{2,7,9,10,1}));
        assertArrayEquals(new int[] {8,6,5}, instance.search(new int[]{1,3,8,7,6,5,9}));
        assertArrayEquals(new int[] {8,3,6,5}, instance.search(new int[]{1,8,3,7,6,5,9}));
    }
}
