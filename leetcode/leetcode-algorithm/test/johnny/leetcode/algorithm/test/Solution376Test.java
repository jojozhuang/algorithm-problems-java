package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution376;

public class Solution376Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("wiggleMaxLength");
        Solution376 instance = new Solution376();

        assertEquals(6, instance.wiggleMaxLength(new int[] {1,7,4,9,2,5}));
        assertEquals(7, instance.wiggleMaxLength(new int[] {1,17,5,10,13,15,10,5,16,8}));
        assertEquals(2, instance.wiggleMaxLength(new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
