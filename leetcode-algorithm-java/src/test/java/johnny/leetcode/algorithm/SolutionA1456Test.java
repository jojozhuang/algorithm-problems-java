package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1456Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxVowels");
        SolutionA1456 instance = new SolutionA1456();

        assertEquals(3, instance.maxVowels("abciiidef", 3));
        assertEquals(2, instance.maxVowels("aeiou", 2));
        assertEquals(2, instance.maxVowels("leetcode", 3));
        assertEquals(0, instance.maxVowels("rhythms", 4));
        assertEquals(1, instance.maxVowels("tryhard", 4));

    }
}
