package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution408;

public class Solution408Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validWordAbbreviation");
        Solution408 instance = new Solution408();

        assertEquals(true, instance.validWordAbbreviation("internationalization", "i12iz4n"));
        assertEquals(false, instance.validWordAbbreviation("apple", "a2e"));
    }
}
