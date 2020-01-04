package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution552Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkRecord");
        Solution552 instance = new Solution552();

        assertEquals(8, instance.checkRecord(2));
    }
}
