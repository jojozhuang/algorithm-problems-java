package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution451;

public class Solution451Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("frequencySort");
        Solution451 instance = new Solution451();

        assertEquals("eert", instance.frequencySort("tree"));
        assertEquals("aaaccc", instance.frequencySort("cccaaa"));
        assertEquals("bbAa", instance.frequencySort("Aabb"));
    }
}
