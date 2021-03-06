package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution557Test extends JunitBase {

    @Test
    public void testReverseWords() {
        System.out.println("reverseWords");
        Solution557 instance = new Solution557();

        assertEquals("", instance.reverseWords(""));
        assertEquals("a", instance.reverseWords("a"));
        assertEquals("ba", instance.reverseWords("ab"));
        assertEquals("a b", instance.reverseWords("a b"));
        assertEquals("ba dc e", instance.reverseWords("ab cd e"));
        assertEquals("ba dc gfe", instance.reverseWords("ab cd efg"));
        assertEquals("s'teL ekat edoCteeL tsetnoc", instance.reverseWords("Let's take LeetCode contest"));
    }
}
