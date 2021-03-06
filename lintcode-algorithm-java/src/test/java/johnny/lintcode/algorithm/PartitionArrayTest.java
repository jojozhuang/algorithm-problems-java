package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartitionArrayTest extends JunitBase {

    @Test
    public void testPartitionArray() {
        System.out.println("partitionArray");
        int[] nums = null;
        int k = 0;
        PartitionArray instance = new PartitionArray();
        int expResult = 0;
        int result = instance.partitionArray(nums, k);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.partitionArray(new int[] {1,2}, 2));
        assertEquals(1, instance.partitionArray(new int[] {3,2,2,1}, 2));
        assertEquals(2, instance.partitionArray(new int[] {3,4,2,1}, 3));
        assertEquals(2, instance.partitionArray(new int[] {3,3,2,1}, 3));
        assertEquals(10, instance.partitionArray(new int[] {9,9,9,8,9,8,7,9,8,8,8,9,8,9,8,8,6,9}, 9));
    }
}
