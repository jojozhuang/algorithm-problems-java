package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution583;

public class Solution583Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDistance");
        Solution583 instance = new Solution583();

        assertEquals(2, instance.minDistance("sea", "eat"));
    }
}
