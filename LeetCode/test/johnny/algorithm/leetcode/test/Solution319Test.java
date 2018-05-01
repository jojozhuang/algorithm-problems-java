package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution319;

public class Solution319Test extends JunitBase {

    @Test
    public void testBulbSwitch() {
        System.out.println("bulbSwitch");
        Solution319 instance = new Solution319();

        assertEquals(0, instance.bulbSwitch(0));
        assertEquals(1, instance.bulbSwitch(1));
        assertEquals(1, instance.bulbSwitch(2));
        assertEquals(1, instance.bulbSwitch(3));
        assertEquals(2, instance.bulbSwitch(4));
        assertEquals(2, instance.bulbSwitch(5));
        assertEquals(2, instance.bulbSwitch(6));
        assertEquals(2, instance.bulbSwitch(7));
        assertEquals(2, instance.bulbSwitch(8));
        assertEquals(3, instance.bulbSwitch(9));
        assertEquals(3, instance.bulbSwitch(10));
    }
}
