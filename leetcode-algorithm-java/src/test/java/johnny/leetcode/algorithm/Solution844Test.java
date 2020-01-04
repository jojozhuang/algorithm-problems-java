package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution844Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("backspaceCompare");
        Solution844 instance = new Solution844();

        assertEquals(true, instance.backspaceCompare("ab#c", "ad#c"));
        assertEquals(true, instance.backspaceCompare("ab##", "c#d#"));
        assertEquals(true, instance.backspaceCompare("a##c", "#a#c"));
        assertEquals(false, instance.backspaceCompare("a#c", "b"));
    }
}
