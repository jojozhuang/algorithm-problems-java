package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution424;

public class Solution424Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("characterReplacement");
        Solution424 instance = new Solution424();

        assertEquals(4, instance.characterReplacement("ABAB",2));
        assertEquals(4, instance.characterReplacement("AABABBA",1));
    }
}
