package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution466Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("getMaxRepetitions");
        Solution466 instance = new Solution466();

        assertEquals(2, instance.getMaxRepetitions("acb", 4, "ab", 2));
        assertEquals(100000000, instance.getMaxRepetitions("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",1000000,"a",1));
    }
}
