package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class RecoverRotatedSortedArrayTest extends JunitBase {

    /**
     * Test of recoverRotatedSortedArray method, of class RecoverRotatedSortedArray.
     */
    @Test
    public void testRecoverRotatedSortedArray() {
        System.out.println("recoverRotatedSortedArray");
        ArrayList<Integer> nums = null;
        RecoverRotatedSortedArray instance = new RecoverRotatedSortedArray();
        instance.recoverRotatedSortedArray(nums);
        
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(4);
        nums2.add(5);
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        instance.recoverRotatedSortedArray(nums2);
        assertEquals(1, (long)nums2.get(0));
        assertEquals(2, (long)nums2.get(1));
        assertEquals(3, (long)nums2.get(2));
        assertEquals(4, (long)nums2.get(3));
        assertEquals(5, (long)nums2.get(4));
        
        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
           nums3.add(1);
        }
        nums3.add(-1);
        for (int i = 0; i < 11; i++) {
           nums3.add(1);
        }
        instance.recoverRotatedSortedArray(nums3);
        assertEquals(-1, (long)nums3.get(0));
        assertEquals(1, (long)nums3.get(1));
        assertEquals(1, (long)nums3.get(2));
        assertEquals(1, (long)nums3.get(9));
    }
}
