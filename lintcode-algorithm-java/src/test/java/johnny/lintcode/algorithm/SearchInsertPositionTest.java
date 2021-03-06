package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SearchInsertPositionTest extends JunitBase {

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
