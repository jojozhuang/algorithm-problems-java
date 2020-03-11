package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1375Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numTimesAllBlue");
        SolutionA1375 instance = new SolutionA1375();

        assertEquals(1, instance.numTimesAllBlue(new int[]{5,4,3,2,1}));
        assertEquals(3, instance.numTimesAllBlue(new int[]{2,1,3,5,4}));
        assertEquals(2, instance.numTimesAllBlue(new int[]{3,2,4,1,5}));
        assertEquals(1, instance.numTimesAllBlue(new int[]{4,1,2,3}));
        assertEquals(3, instance.numTimesAllBlue(new int[]{2,1,4,3,6,5}));
        assertEquals(6, instance.numTimesAllBlue(new int[]{1,2,3,4,5,6}));

        assertEquals(1, instance.numTimesAllBlue(new int[]{3,1,2}));
    }
}
