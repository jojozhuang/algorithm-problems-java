package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1409Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("processQueries");
        SolutionA1409 instance = new SolutionA1409();

        assertArrayEquals(new int[]{2,1,2,1}, instance.processQueries(new int[]{3,1,2,1}, 5));
        assertArrayEquals(new int[]{3,1,2,0}, instance.processQueries(new int[]{4,1,2,2}, 4));
        assertArrayEquals(new int[]{6,5,0,7,5}, instance.processQueries(new int[]{7,5,5,8,3}, 8));
    }
}
