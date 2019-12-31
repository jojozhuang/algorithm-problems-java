package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution038;

public class Solution038Test extends JunitBase {

    @Test
    public void testCountAndSay() {
        System.out.println("countAndSay");
        Solution038 instance = new Solution038();

        assertEquals("", instance.countAndSay(0));
        assertEquals("1", instance.countAndSay(1));
        assertEquals("11", instance.countAndSay(2));
        assertEquals("21", instance.countAndSay(3));
        assertEquals("1211", instance.countAndSay(4));
        assertEquals("111221", instance.countAndSay(5));
    }
}
