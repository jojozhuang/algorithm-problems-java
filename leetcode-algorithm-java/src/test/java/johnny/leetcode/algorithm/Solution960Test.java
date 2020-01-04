package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution960Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDeletionSize");
        Solution960 instance = new Solution960();

        assertEquals(3, instance.minDeletionSize(new String[] {"babca","bbazb"}));
        assertEquals(4, instance.minDeletionSize(new String[] {"edcba"}));
        assertEquals(0, instance.minDeletionSize(new String[] {"ghi","def","abc"}));
    }
}
