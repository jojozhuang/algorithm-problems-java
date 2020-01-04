package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution660Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("newInteger");
        Solution660 instance = new Solution660();

        assertEquals(10, instance.newInteger(9));
        assertEquals(31, instance.newInteger(28));
    }
}
