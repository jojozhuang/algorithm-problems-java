package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution243Test extends JunitBase {

    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        Solution243 instance = new Solution243();

        String[] words2 = new String[]{"practice","makes","perfect","coding","makes"};
        assertEquals(3, instance.shortestDistance(words2, "coding", "practice"));
        assertEquals(1, instance.shortestDistance(words2, "makes", "coding"));
        
        String[] words3 = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        assertEquals(3, instance.shortestDistance(words3, "practice", "coding"));
        assertEquals(1, instance.shortestDistance(words3, "makes", "coding"));
    }
}
