package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution244Test extends JunitBase {

    @Test
    public void testShortest() {
        System.out.println("shortest");
        Solution244 instance = new Solution244(new String[]{"practice", "makes", "perfect", "coding", "makes"});

        assertEquals(3, instance.shortest("coding", "practice"));
        assertEquals(1, instance.shortest("makes", "coding"));
        assertEquals(1, instance.shortest("makes", "practice"));
    }
}
