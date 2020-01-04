package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution745Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("WordFilter");
        Solution745 instance = new Solution745(new String[] {"apple"});

        assertEquals(0, instance.f("a", "e"));
        assertEquals(-1, instance.f("b", ""));
    }
}
