package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1193Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("distanceBetweenBusStops");
        SolutionA1193 instance = new SolutionA1193();
        assertEquals(1, instance.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 1));
        assertEquals(3, instance.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 2));
        assertEquals(4, instance.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 3));

        assertEquals(2, instance.distanceBetweenBusStops(new int[]{1,2,3,4}, 1, 2));

        assertEquals(17, instance.distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0}, 7, 2));
    }
}
