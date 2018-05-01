package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution621;

public class Solution621Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("leastInterval");
        Solution621 instance = new Solution621();

        assertEquals(8, instance.leastInterval(new char[] {'A','A','A','B','B','B'}, 2));
    }
}
