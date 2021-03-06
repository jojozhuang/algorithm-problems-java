package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution878Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nthMagicalNumber");
        Solution878 instance = new Solution878();

        assertEquals(2, instance.nthMagicalNumber(1,2,3));
        assertEquals(6, instance.nthMagicalNumber(4,2,3));
        assertEquals(10, instance.nthMagicalNumber(5,2,4));
        assertEquals(8, instance.nthMagicalNumber(3,6,4));
    }
}
