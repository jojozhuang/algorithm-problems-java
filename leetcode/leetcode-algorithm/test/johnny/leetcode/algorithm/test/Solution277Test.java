package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution277;

public class Solution277Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findCelebrity");
        Solution277 instance = new Solution277();

        assertEquals(0, instance.findCelebrity(0));
        assertEquals(0, instance.findCelebrity(1));
        assertEquals(-1, instance.findCelebrity(2));
        assertEquals(-1, instance.findCelebrity(3));
        assertEquals(-1, instance.findCelebrity(4));
        assertEquals(-1, instance.findCelebrity(5));
        assertEquals(-1, instance.findCelebrity(6));
        assertEquals(-1, instance.findCelebrity(7));
        assertEquals(-1, instance.findCelebrity(8));
        assertEquals(-1, instance.findCelebrity(9));
        assertEquals(-1, instance.findCelebrity(10));
        assertEquals(-1, instance.findCelebrity(20));
        assertEquals(-1, instance.findCelebrity(100));
    }
}
