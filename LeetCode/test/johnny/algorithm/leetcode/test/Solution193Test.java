package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution193;

public class Solution193Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Valid Phone Numbers  ");
        Solution193 instance = new Solution193();

        assertEquals(0, instance.bash());
    }
}
