package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution729Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("MyCalendar");
        Solution729 instance = new Solution729();

        assertEquals(true, instance.book(10, 20));
        assertEquals(false, instance.book(15, 25));
        assertEquals(true, instance.book(20, 30));
    }
}
