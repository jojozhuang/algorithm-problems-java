package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution901Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("StockSpanner");
        Solution901 instance = new Solution901();

        assertEquals(1, instance.next(100));
        assertEquals(1, instance.next(80));
        assertEquals(1, instance.next(60));
        assertEquals(2, instance.next(70));
        assertEquals(1, instance.next(60));
        assertEquals(4, instance.next(75));
        assertEquals(6, instance.next(85));
    }
}
