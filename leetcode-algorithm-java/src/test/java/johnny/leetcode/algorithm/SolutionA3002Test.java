package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3002Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minNumberOfFrogs");
        SolutionA3002 instance = new SolutionA3002();

        //assertEquals(3, instance.maxVowels("abciiidef", 3));
        //assertEquals(2, instance.maxVowels("aeiou", 2));
        //a//ssertEquals(2, instance.maxVowels("leetcode", 3));
        //assertEquals(0, instance.maxVowels("rhythms", 4));
        assertEquals(1, instance.maxVowels("tryhard", 4));

    }
}
