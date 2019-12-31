package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution521;

public class Solution521Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLUSlength");
        Solution521 instance = new Solution521();

        assertEquals(3, instance.findLUSlength("aba", "cdc"));
    }
}
