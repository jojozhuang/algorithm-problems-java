package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution458;

public class Solution458Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("poorPigs");
        Solution458 instance = new Solution458();

        assertEquals(10, instance.poorPigs(1000, 15, 20));
    }
}
