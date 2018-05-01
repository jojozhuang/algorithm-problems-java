package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution418;

public class Solution418Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("wordsTyping");
        Solution418 instance = new Solution418();

        String[] sentence1 = new String[] {"hello", "world"};
        assertEquals(1, instance.wordsTyping(sentence1,2,8));

        String[] sentence2 = new String[] {"a", "bcd", "e"};
        assertEquals(2, instance.wordsTyping(sentence2,3,6));

        String[] sentence3 = new String[] {"I", "had", "apple", "pie"};
        assertEquals(1, instance.wordsTyping(sentence3,4,5));
    }
}
