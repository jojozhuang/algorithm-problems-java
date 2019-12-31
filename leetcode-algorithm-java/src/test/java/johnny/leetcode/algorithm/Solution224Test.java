package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution224;

public class Solution224Test extends JunitBase {

    @Test
    public void testCalculate() {
        System.out.println("calculate");
        Solution224 instance = new Solution224();

        assertEquals(0, instance.calculate(""));
        assertEquals(2, instance.calculate("1 +1"));
        assertEquals(3, instance.calculate("2-1+2"));
        assertEquals(0, instance.calculate("1 + (2 -3)"));
        assertEquals(-3, instance.calculate("4 - (5 + 2)"));
        assertEquals(23, instance.calculate("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(2147483647, instance.calculate("2147483647"));
    }
}
