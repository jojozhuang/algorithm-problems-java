package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1394Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLucky");
        SolutionA1394 instance = new SolutionA1394();

        assertEquals(2, instance.findLucky(new int[]{2,2,3,4}));
        assertEquals(3, instance.findLucky(new int[]{1,2,2,3,3,3}));
        assertEquals(-1, instance.findLucky(new int[]{2,2,2,3,3}));
        assertEquals(-1, instance.findLucky(new int[]{5}));
        assertEquals(7, instance.findLucky(new int[]{7,7,7,7,7,7,7}));
    }
}
