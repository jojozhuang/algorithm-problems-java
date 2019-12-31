package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution884;

public class Solution884Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uncommonFromSentences");
        Solution884 instance = new Solution884();

        assertArrayEquals(new String[] {"sweet","sour"}, instance.uncommonFromSentences("this apple is sweet", "this apple is sour"));
        assertArrayEquals(new String[] {"banana"}, instance.uncommonFromSentences("apple apple","banana"));
    }
}
