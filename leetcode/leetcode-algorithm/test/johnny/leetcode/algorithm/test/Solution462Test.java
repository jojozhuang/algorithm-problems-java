package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution462;

public class Solution462Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minMoves2");
        Solution462 instance = new Solution462();

        assertEquals(2, instance.minMoves2(new int[]{1,2,3}));
    }
}
