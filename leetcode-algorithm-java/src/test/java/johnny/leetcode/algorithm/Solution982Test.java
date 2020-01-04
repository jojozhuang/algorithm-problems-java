package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution982Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countTriplets");
        Solution982 instance = new Solution982();

        assertEquals(12, instance.countTriplets(new int[] {2,1,3}));

    }
}
