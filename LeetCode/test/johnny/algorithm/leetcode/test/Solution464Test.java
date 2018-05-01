package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution464;

public class Solution464Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canIWin");
        Solution464 instance = new Solution464();

        assertEquals(false, instance.canIWin(10,11));
    }
}
