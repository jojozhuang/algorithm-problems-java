package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution245;

public class Solution245Test extends JunitBase {

    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        Solution245 instance = new Solution245();

        assertEquals(Integer.MAX_VALUE, instance.shortestWordDistance(new String[]{}, "", ""));

        String[] words2 = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        assertEquals(3, instance.shortestWordDistance(words2, "coding", "practice"));
        assertEquals(1, instance.shortestWordDistance(words2, "makes", "coding"));
        assertEquals(3, instance.shortestWordDistance(words2, "makes", "makes"));

        String[] words3 = new String[]{"practice", "makes", "perfect", "coding", "makes","makes"};
        assertEquals(3, instance.shortestWordDistance(words3, "coding", "practice"));
        assertEquals(1, instance.shortestWordDistance(words3, "makes", "coding"));
        assertEquals(1, instance.shortestWordDistance(words3, "makes", "makes"));
    }
}
