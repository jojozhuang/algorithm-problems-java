package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution819;

public class Solution819Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("mostCommonWord");
        Solution819 instance = new Solution819();

        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        assertEquals("ball", instance.mostCommonWord(paragraph1, banned1));
    }
}
