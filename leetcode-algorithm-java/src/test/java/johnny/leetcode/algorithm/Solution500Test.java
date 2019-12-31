package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution500;

public class Solution500Test extends JunitBase {

    @Test
    public void testFindWords() {
        System.out.println("findWords");
        Solution500 instance = new Solution500();

        assertArrayEquals(new String[]{}, instance.findWords(new String[]{}));
        assertArrayEquals(new String[]{}, instance.findWords(new String[]{"Hello"}));
        assertArrayEquals(new String[]{"Alaska"}, instance.findWords(new String[]{"Alaska"}));
        assertArrayEquals(new String[]{"Alaska", "Dad"}, instance.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }
}
