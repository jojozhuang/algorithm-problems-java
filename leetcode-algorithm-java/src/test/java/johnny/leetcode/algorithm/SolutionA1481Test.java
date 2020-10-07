package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1481Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLeastNumOfUniqueInts");
        SolutionA1481 instance = new SolutionA1481();

        assertEquals(1, instance.findLeastNumOfUniqueInts(new int[]{5,5,4}, 1));
        assertEquals(2, instance.findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3));

    }
}
