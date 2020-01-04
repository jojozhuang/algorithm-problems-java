package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution408Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validWordAbbreviation");
        Solution408 instance = new Solution408();

        assertEquals(true, instance.validWordAbbreviation("internationalization", "i12iz4n"));
        assertEquals(false, instance.validWordAbbreviation("apple", "a2e"));
    }
}
