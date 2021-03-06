package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution855Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("ExamRoom");
        Solution855 instance = new Solution855(10);

        assertEquals(0, instance.seat());
        assertEquals(9, instance.seat());
        assertEquals(4, instance.seat());
        assertEquals(2, instance.seat());
        instance.leave(4);
        assertEquals(5, instance.seat());
    }
}
