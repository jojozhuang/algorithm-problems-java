package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1362Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("closestDivisors");
        SolutionA1362 instance = new SolutionA1362();
        assertArrayEquals(new int[]{3,3}, instance.closestDivisors(8));
        assertArrayEquals(new int[]{5,25}, instance.closestDivisors(123));
        assertArrayEquals(new int[]{25,40}, instance.closestDivisors(999));
    }
}
