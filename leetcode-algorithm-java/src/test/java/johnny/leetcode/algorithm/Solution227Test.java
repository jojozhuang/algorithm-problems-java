package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution227Test extends JunitBase {

    @Test
    public void testCalculate() {
        System.out.println("calculate");
        Solution227 instance = new Solution227();

        assertEquals(0, instance.calculate(""));
        assertEquals(7, instance.calculate("3+2*2"));
        assertEquals(1, instance.calculate(" 3/2"));
        assertEquals(5, instance.calculate(" 3+5 / 2 "));
    }
}
