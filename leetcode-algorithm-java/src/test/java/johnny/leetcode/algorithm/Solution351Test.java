package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution351Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfPatterns");
        Solution351 instance = new Solution351();

        assertEquals(9, instance.numberOfPatterns(1,1));
    }
}
