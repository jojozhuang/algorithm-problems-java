package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution720Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestWord");
        Solution720 instance = new Solution720();

        assertEquals("world", instance.longestWord(new String[] {"w","wo","wor","worl", "world"}));
        assertEquals("apple", instance.longestWord(new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }
}
