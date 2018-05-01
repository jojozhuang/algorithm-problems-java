package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution522;

public class Solution522Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLUSlength");
        Solution522 instance = new Solution522();

        assertEquals(3, instance.findLUSlength(new String[] {"aba", "cdc", "eae"}));
    }
}
