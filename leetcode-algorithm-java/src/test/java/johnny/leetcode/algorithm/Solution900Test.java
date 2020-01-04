package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution900Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("RLEIterator");
        Solution900 instance = new Solution900(new int[] {3,8,0,9,2,5});

        assertEquals(8, instance.next(2));
        assertEquals(8, instance.next(1));
        assertEquals(5, instance.next(1));
        assertEquals(-1, instance.next(2));
    }
}
