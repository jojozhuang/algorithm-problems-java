package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution844;

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
