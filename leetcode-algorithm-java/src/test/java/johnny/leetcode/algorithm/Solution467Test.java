package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution467Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findSubstringInWraproundString");
        Solution467 instance = new Solution467();

        assertEquals(1, instance.findSubstringInWraproundString("a"));
        assertEquals(2, instance.findSubstringInWraproundString("cac"));
        assertEquals(6, instance.findSubstringInWraproundString("zab"));
    }
}
