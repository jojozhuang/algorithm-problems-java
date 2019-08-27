package johnny.lintcode.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.SearchInsertPosition;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SearchInsertPositionTest {
    
    public SearchInsertPositionTest() {
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
     * Test of searchInsert method, of class SearchInsertPosition.
     */
    @Test
    public void testSearchInsert() {
        System.out.println("searchInsert");
        int[] nums = null;
        int target = 0;
        SearchInsertPosition instance = new SearchInsertPosition();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.searchInsert(new int[]{1}, 1));
        assertEquals(1, instance.searchInsert(new int[]{1}, 2));
        assertEquals(0, instance.searchInsert(new int[]{1}, -1));
        assertEquals(0, instance.searchInsert(new int[]{1,2}, -1));
        assertEquals(1, instance.searchInsert(new int[]{1,3}, 2));
        assertEquals(2, instance.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, instance.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, instance.searchInsert(new int[]{1,3,5,6}, 7));
        assertEquals(0, instance.searchInsert(new int[]{1,3,5,6}, 0));
        assertEquals(3, instance.searchInsert(new int[]{-1,0,1,2}, 2));
    }   
}
