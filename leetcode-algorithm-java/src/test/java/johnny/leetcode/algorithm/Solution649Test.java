package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution649Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("predictPartyVictory");
        Solution649 instance = new Solution649();

        assertEquals("Radiant", instance.predictPartyVictory("RD"));
        assertEquals("Dire", instance.predictPartyVictory("RDD"));
    }
}
