package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution940Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("distinctSubseqII");
        Solution940 instance = new Solution940();

        assertEquals(7, instance.distinctSubseqII("abc"));
        assertEquals(6, instance.distinctSubseqII("aba"));
        assertEquals(3, instance.distinctSubseqII("aaa"));
    }
}
