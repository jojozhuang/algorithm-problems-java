package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution961Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("repeatedNTimes");
        Solution961 instance = new Solution961();

        assertEquals(3, instance.repeatedNTimes(new int[] {1,2,3,3}));
        assertEquals(2, instance.repeatedNTimes(new int[] {2,1,2,5,3,2}));
        assertEquals(5, instance.repeatedNTimes(new int[] {5,1,5,2,5,3,5,4}));
    }
}
