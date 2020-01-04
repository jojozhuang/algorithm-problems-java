package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution423Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("originalDigits");
        Solution423 instance = new Solution423();

        assertEquals("012", instance.originalDigits("owoztneoer"));
        assertEquals("45", instance.originalDigits("fviefuro"));
    }
}
