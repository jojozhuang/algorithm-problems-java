package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1365Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallerNumbersThanCurrent");
        SolutionA1365 instance = new SolutionA1365();

        assertArrayEquals(new int[]{4,0,1,1,3}, instance.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
        assertArrayEquals(new int[]{2,1,0,3}, instance.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
        assertArrayEquals(new int[]{0,0,0,0}, instance.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }
}
