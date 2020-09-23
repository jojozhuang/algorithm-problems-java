package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3052Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3052 instance = new SolutionA3052();

        assertEquals(0, instance.numTriplets(new int[]{43024,99908}, new int[]{1864}));
        assertEquals(1, instance.numTriplets(new int[]{7,4}, new int[]{5,2,8,9}));
        assertEquals(9, instance.numTriplets(new int[]{1,1}, new int[]{1,1,1}));
        assertEquals(2, instance.numTriplets(new int[]{7,7,8,3}, new int[]{1,2,9,7}));
        assertEquals(0, instance.numTriplets(new int[]{4,7,9,11,23}, new int[]{3,5,1024,12,18}));

    }
}
