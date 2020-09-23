package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostFrequentWordIITest extends JunitBase {

    @Test
    public void testMostCommonWord() {
        System.out.println("testMostCommonWord");
        MostFrequentWordII instance = new MostFrequentWordII();

        assertEquals("hit", instance.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit."));
        assertEquals("a", instance.mostCommonWord("a a a b b b c c d"));
    }
}
