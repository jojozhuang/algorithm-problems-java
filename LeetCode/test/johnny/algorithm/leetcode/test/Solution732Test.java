package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution732;

public class Solution732Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("MyCalendarThree");
        Solution732 instance = new Solution732();

        assertEquals(1, instance.book(10, 20));
        assertEquals(1, instance.book(50, 60));
        assertEquals(2, instance.book(10, 40));
        assertEquals(3, instance.book(5, 15));
        assertEquals(3, instance.book(5, 10));
        assertEquals(3, instance.book(25, 55));
    }
}
