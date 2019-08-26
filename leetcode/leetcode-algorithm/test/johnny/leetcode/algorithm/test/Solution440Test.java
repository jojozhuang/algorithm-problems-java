package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution440;

public class Solution440Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findKthNumber");
        Solution440 instance = new Solution440();

        assertEquals(10, instance.findKthNumber(13,2));
    }
}
