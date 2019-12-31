package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution487;

public class Solution487Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaxConsecutiveOnes");
        Solution487 instance = new Solution487();

        assertEquals(4, instance.findMaxConsecutiveOnes(new int[] {1,0,1,1,0}));
    }
}
