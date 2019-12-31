package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution377;

public class Solution377Test extends JunitBase {

    @Test
    public void testCombinationSum4() {
        System.out.println("combinationSum4");
        Solution377 instance = new Solution377();

        assertEquals(0, instance.combinationSum4(null, 0));
        assertEquals(1, instance.combinationSum4(new int[]{1}, 1));
        assertEquals(1, instance.combinationSum4(new int[]{1,2}, 1));
        assertEquals(2, instance.combinationSum4(new int[]{1,2}, 2));
        assertEquals(3, instance.combinationSum4(new int[]{1,2}, 3));
        assertEquals(5, instance.combinationSum4(new int[]{1,2}, 4));
        assertEquals(7, instance.combinationSum4(new int[]{1,2,3}, 4));
        assertEquals(39882198, instance.combinationSum4(new int[]{4,2,1}, 32));
        assertEquals(181997601, instance.combinationSum4(new int[]{1,2,3}, 32));
    }
}
