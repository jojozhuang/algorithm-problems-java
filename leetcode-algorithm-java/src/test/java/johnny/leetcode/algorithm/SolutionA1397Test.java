package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1397Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findGoodStrings");
        SolutionA1397 instance = new SolutionA1397();

        assertEquals(51, instance.findGoodStrings(2, "aa", "da", "b"));
        assertEquals(0, instance.findGoodStrings(8, "leetcode", "leetgoes", "leet"));
        assertEquals(2, instance.findGoodStrings(2, "gx", "gz", "x"));
    }
}
