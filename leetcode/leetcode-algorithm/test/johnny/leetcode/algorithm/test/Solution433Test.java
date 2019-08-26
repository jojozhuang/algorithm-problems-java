package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution433;

public class Solution433Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minMutation");
        Solution433 instance = new Solution433();

        assertEquals(1, instance.minMutation("AACCGGTT","AACCGGTA", new String[] {"AACCGGTA"}));
        assertEquals(2, instance.minMutation("AACCGGTT","AAACGGTA", new String[] {"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
        assertEquals(3, instance.minMutation("AAAAACCC","AACCCCCC", new String[] {"AAAACCCC", "AAACCCCC", "AACCCCCC"}));
    }
}
