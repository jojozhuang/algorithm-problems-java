package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution115;

public class Solution115Test extends JunitBase {

    @Test
    public void testNumDistinct() {
        System.out.println("numDistinct");
        Solution115 instance = new Solution115();

        assertEquals(0, instance.numDistinct("", null));
        assertEquals(1, instance.numDistinct("a", ""));
        assertEquals(1, instance.numDistinct("ab", "a"));
        assertEquals(2, instance.numDistinct("aa", "a"));
        assertEquals(1, instance.numDistinct("abc", "ab"));
        assertEquals(2, instance.numDistinct("abad", "ad"));
        assertEquals(3, instance.numDistinct("rabbbit", "rabbit"));
    }
}
