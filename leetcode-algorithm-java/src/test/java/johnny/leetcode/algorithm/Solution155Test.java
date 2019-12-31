package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution155;

public class Solution155Test extends JunitBase {

    @Test
    public void testMinStack() {
        System.out.println("minStack");
        Solution155 instance = new Solution155();

        instance.push(4);
        assertEquals(4, instance.getMin());
        instance.push(2);
        assertEquals(2, instance.getMin());
        instance.push(3);
        assertEquals(2, instance.getMin());
        assertEquals(3, instance.top());
        instance.push(1);
        assertEquals(1, instance.getMin());
        assertEquals(1, instance.top());
        instance.pop();
        assertEquals(2, instance.getMin());
        assertEquals(3, instance.top());
    }
}
