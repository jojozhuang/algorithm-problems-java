package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution158;

public class Solution158Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("read");
        Solution158 instance = new Solution158();

        assertEquals(0, instance.read(new char[] {}, 2));
    }
}
