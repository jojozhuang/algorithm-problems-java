package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution952Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestComponentSize");
        Solution952 instance = new Solution952();

        assertEquals(4, instance.largestComponentSize(new int[] {4,6,15,35}));
        assertEquals(2, instance.largestComponentSize(new int[] {20,50,9,63}));
        assertEquals(8, instance.largestComponentSize(new int[] {2,3,6,7,4,12,21,39}));
        assertEquals(8, instance.largestComponentSize(new int[] {99,100,69,39,14,56,91,60}));
    }
}
