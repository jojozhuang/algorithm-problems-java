package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution881Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numRescueBoats");
        Solution881 instance = new Solution881();

        assertEquals(1, instance.numRescueBoats(new int[] {1,2},3));
        assertEquals(3, instance.numRescueBoats(new int[] {3,2,2,1},3));
        assertEquals(4, instance.numRescueBoats(new int[] {3,5,3,4},5));
    }
}
