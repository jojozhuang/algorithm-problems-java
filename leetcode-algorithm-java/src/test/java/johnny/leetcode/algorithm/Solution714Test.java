package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution714;

public class Solution714Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxProfit");
        Solution714 instance = new Solution714();

        assertEquals(8, instance.maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2));
    }
}
