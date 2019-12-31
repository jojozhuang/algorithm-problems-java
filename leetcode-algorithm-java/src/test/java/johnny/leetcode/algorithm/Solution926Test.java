package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution926;

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
