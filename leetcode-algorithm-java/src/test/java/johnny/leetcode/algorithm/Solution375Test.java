package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution375;

public class Solution375Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("getMoneyAmount");
        Solution375 instance = new Solution375();

        assertEquals(16, instance.getMoneyAmount(10));
    }
}
