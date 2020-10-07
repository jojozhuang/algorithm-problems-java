package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1608Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumOneBitOperations");
        SolutionA1608 instance = new SolutionA1608();

        assertEquals(2, instance.specialArray(new int[]{3,5}));
        assertEquals(-1, instance.specialArray(new int[]{0,0}));
        assertEquals(3, instance.specialArray(new int[]{0,4,3,0,4}));
        assertEquals(-1, instance.specialArray(new int[]{3,6,7,7,0}));


    }
}
