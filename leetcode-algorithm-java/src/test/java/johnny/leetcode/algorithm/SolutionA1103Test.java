package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1103Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("distributeCandies");
        SolutionA1103 instance = new SolutionA1103();

        assertArrayEquals(new int[] {1,2,3,1},instance.distributeCandies(7,4));
        assertArrayEquals(new int[] {5,2,3},instance.distributeCandies(10,3));
    }
}
