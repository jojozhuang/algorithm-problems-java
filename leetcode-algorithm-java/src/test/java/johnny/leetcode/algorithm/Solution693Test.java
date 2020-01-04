package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution693Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("hasAlternatingBits");
        Solution693 instance = new Solution693();

        assertEquals(true, instance.hasAlternatingBits(1));
        assertEquals(true, instance.hasAlternatingBits(2));
        assertEquals(false, instance.hasAlternatingBits(3));
        assertEquals(true, instance.hasAlternatingBits(5));
        assertEquals(false, instance.hasAlternatingBits(7));
        assertEquals(true, instance.hasAlternatingBits(10));
    }
}
