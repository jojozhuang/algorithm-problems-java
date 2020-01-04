package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution926Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minFlipsMonoIncr");
        Solution926 instance = new Solution926();

        assertEquals(1, instance.minFlipsMonoIncr("00110"));
        assertEquals(2, instance.minFlipsMonoIncr("010110"));
        assertEquals(2, instance.minFlipsMonoIncr("00011000"));
    }
}
