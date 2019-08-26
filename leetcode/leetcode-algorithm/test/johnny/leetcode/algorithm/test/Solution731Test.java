package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution731;

public class Solution731Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("MyCalendarTwo");
        Solution731 instance = new Solution731();

        assertEquals(true, instance.book(10, 20));
        assertEquals(true, instance.book(50, 60));
        assertEquals(true, instance.book(10, 40));
        assertEquals(false, instance.book(5, 15));
        assertEquals(true, instance.book(5, 10));
        assertEquals(true, instance.book(25, 55));
    }
}
