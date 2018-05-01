package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution790;

public class Solution790Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numTilings");
        Solution790 instance = new Solution790();

        assertEquals(5, instance.numTilings(3));
    }
}
