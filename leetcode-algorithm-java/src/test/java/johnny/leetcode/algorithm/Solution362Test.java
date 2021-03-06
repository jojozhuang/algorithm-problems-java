package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution362Test extends JunitBase {

    @Test
    public void testHit() {
        System.out.println("hit");
        Solution362 instance = new Solution362();

        instance.hit(1);
        instance.hit(2);
        instance.hit(3);
        assertEquals(3, instance.getHits(4));
        instance.hit(300);
        assertEquals(4, instance.getHits(300));
        assertEquals(3, instance.getHits(301));
    }
}
