package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution423;

public class Solution423Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("originalDigits");
        Solution423 instance = new Solution423();

        assertEquals("012", instance.originalDigits("owoztneoer"));
        assertEquals("45", instance.originalDigits("fviefuro"));
    }
}
