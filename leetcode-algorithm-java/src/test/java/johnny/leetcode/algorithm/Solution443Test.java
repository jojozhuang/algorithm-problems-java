package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution443Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("compress");
        Solution443 instance = new Solution443();

        assertEquals(6, instance.compress(new char[] {'a','a','b','b','c','c','c'}));
        assertEquals(1, instance.compress(new char[] {'a'}));
        assertEquals(4, instance.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
