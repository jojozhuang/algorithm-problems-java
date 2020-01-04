package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution712Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumDeleteSum");
        Solution712 instance = new Solution712();

        assertEquals(231, instance.minimumDeleteSum("sea","eat"));
        assertEquals(403, instance.minimumDeleteSum("delete","leet"));
    }
}
