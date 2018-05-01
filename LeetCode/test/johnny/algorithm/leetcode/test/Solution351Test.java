package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution351;

public class Solution351Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfPatterns");
        Solution351 instance = new Solution351();

        assertEquals(9, instance.numberOfPatterns(1,1));
    }
}
