package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution058Test extends JunitBase {

    @Test
    public void testLengthOfLastWord() {
        System.out.println("lengthOfLastWord");
        Solution058 instance = new Solution058();

        assertEquals(0, instance.lengthOfLastWord(""));
        assertEquals(1, instance.lengthOfLastWord("a"));
        assertEquals(1, instance.lengthOfLastWord("a "));
        assertEquals(2, instance.lengthOfLastWord("teach me "));
        assertEquals(3, instance.lengthOfLastWord(" abc"));
        assertEquals(5, instance.lengthOfLastWord("Hello World"));
        assertEquals(6, instance.lengthOfLastWord("133 Hello Kitty!"));
    }
}
