package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution346Test extends JunitBase {

    @Test
    public void testNext() {
        System.out.println("next");
        Solution346 instance = new Solution346(3);

        assertEquals(0.0, instance.next(0), 0.0);
        assertEquals(1.5, instance.next(3), 0.001);
        assertEquals(1, instance.next(0), 0.001);
        assertEquals(2, instance.next(3), 0.001);
        assertEquals(1, instance.next(0), 0.001);
    }
}
