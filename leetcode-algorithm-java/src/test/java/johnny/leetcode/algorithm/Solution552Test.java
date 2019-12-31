package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution552;

public class Solution552Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkRecord");
        Solution552 instance = new Solution552();

        assertEquals(8, instance.checkRecord(2));
    }
}
