package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestABSubstringTest extends JunitBase {

    @Test
    public void testLongestABSubstring() {
        System.out.println("longestABSubstring");
        LongestABSubstring instance = new LongestABSubstring();
        assertEquals(0, instance.getAns(null));

        assertEquals(2, instance.getAns("AAAB"));
        assertEquals(8, instance.getAns("ABAAABBBA"));
        assertEquals(0, instance.getAns("AAAAA"));

    }
}
