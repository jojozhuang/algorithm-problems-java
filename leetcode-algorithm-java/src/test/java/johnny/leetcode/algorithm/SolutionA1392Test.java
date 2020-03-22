package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1392Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestPrefix");
        SolutionA1392 instance = new SolutionA1392();

        assertEquals("l", instance.longestPrefix("level"));
        assertEquals("abab", instance.longestPrefix("ababab"));
        assertEquals("leet", instance.longestPrefix("leetcodeleet"));
        assertEquals("", instance.longestPrefix("a"));
    }
}
