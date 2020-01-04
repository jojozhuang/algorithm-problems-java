package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution487Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaxConsecutiveOnes");
        Solution487 instance = new Solution487();

        assertEquals(4, instance.findMaxConsecutiveOnes(new int[] {1,0,1,1,0}));
    }
}
