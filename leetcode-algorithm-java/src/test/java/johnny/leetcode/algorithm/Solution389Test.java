package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution389;

public class Solution389Test extends JunitBase {

    @Test
    public void testFindTheDifference() {
        System.out.println("findTheDifference");
        Solution389 instance = new Solution389();

        assertEquals(' ', instance.findTheDifference("", ""));
        assertEquals(' ', instance.findTheDifference("a", ""));
        assertEquals('y', instance.findTheDifference("", "y"));
        assertEquals(' ', instance.findTheDifference("a", "ccc"));
        assertEquals('d', instance.findTheDifference("abc", "abdc"));
        assertEquals('e', instance.findTheDifference("abcd", "abcde"));
    }
}
