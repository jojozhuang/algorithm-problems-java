package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution290;

public class Solution290Test extends JunitBase {

    @Test
    public void testWordPattern() {
        System.out.println("wordPattern");
        Solution290 instance = new Solution290();

        assertEquals(false, instance.wordPattern("", ""));
        assertEquals(true, instance.wordPattern("abba", "dog cat cat dog"));
        assertEquals(false, instance.wordPattern("abba", "dog cat cat fish"));
        assertEquals(false, instance.wordPattern("aaaa", "dog cat cat dog"));
        assertEquals(false, instance.wordPattern("abba", "dog dog dog dog"));
    }
}
