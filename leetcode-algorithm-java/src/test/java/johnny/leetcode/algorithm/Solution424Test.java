package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution424Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("characterReplacement");
        Solution424 instance = new Solution424();

        assertEquals(4, instance.characterReplacement("ABAB",2));
        assertEquals(4, instance.characterReplacement("AABABBA",1));
    }
}
