package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution792Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numMatchingSubseq");
        Solution792 instance = new Solution792();

        assertEquals(3, instance.numMatchingSubseq("abcde", new String[] {"a", "bb", "acd", "ace"}));
    }
}
