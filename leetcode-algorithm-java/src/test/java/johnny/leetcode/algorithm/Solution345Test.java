package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution345;

public class Solution345Test extends JunitBase {

    @Test
    public void testReverseVowels() {
        System.out.println("reverseVowels");
        Solution345 instance = new Solution345();

        assertEquals("", instance.reverseVowels(""));
        assertEquals("holle", instance.reverseVowels("hello"));
        assertEquals("leotcede", instance.reverseVowels("leetcode"));
        assertEquals("a.b,.", instance.reverseVowels("a.b,."));
        assertEquals("Aa", instance.reverseVowels("aA"));
    }
}