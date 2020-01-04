package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
