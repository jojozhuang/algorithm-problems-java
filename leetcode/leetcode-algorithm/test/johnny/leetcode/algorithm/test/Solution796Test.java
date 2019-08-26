package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution796;

public class Solution796Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("rotateString");
        Solution796 instance = new Solution796();

        assertEquals(true, instance.rotateString("abcde","cdeab"));
        assertEquals(false, instance.rotateString("abcde","abced"));
    }
}
