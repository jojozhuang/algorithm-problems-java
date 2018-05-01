package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution440;

public class Solution440Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findKthNumber");
        Solution440 instance = new Solution440();

        assertEquals(10, instance.findKthNumber(13,2));
    }
}
