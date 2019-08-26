package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution810;

public class Solution810Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("xorGame");
        Solution810 instance = new Solution810();

        assertEquals(false, instance.xorGame(new int[] {1,1,2}));
    }
}
