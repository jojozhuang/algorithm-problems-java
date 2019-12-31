package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1011;

public class SolutionA1011Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shipWithinDays");
        SolutionA1011 instance = new SolutionA1011();

        assertEquals(15, instance.shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));
        assertEquals(6, instance.shipWithinDays(new int[] {3,2,2,4,1,4}, 3));
        assertEquals(3, instance.shipWithinDays(new int[] {1,2,3,1,1}, 4));

    }
}
