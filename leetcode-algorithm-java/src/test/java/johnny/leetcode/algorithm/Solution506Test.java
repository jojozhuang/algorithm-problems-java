package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution506;

public class Solution506Test extends JunitBase {

    @Test
    public void testFindRelativeRanks() {
        System.out.println("findRelativeRanks");
        Solution506 instance = new Solution506();

        assertArrayEquals(new String[]{}, instance.findRelativeRanks(new int[]{}));
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal"}, instance.findRelativeRanks(new int[]{2,1}));
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, instance.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new String[]{"Bronze Medal", "4", "5", "Silver Medal", "Gold Medal" }, instance.findRelativeRanks(new int[]{3,2,1,4,5}));
    }
}
