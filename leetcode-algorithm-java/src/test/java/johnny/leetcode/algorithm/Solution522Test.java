package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution522Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLUSlength");
        Solution522 instance = new Solution522();

        assertEquals(3, instance.findLUSlength(new String[] {"aba", "cdc", "eae"}));
    }
}
