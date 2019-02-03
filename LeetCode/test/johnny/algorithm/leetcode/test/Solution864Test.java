package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution864;

public class Solution864Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestPathAllKeys");
        Solution864 instance = new Solution864();

        assertEquals(8, instance.shortestPathAllKeys(new String[] {"@.a.#","###.#","b.A.B"}));
        assertEquals(6, instance.shortestPathAllKeys(new String[] {"@..aA","..B#.","....b"}));
    }
}
