package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1033Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numMovesStones");
        SolutionA1033 instance = new SolutionA1033();

        assertArrayEquals(new int[] {1,2},instance.numMovesStones(1,2,5));
        assertArrayEquals(new int[] {0,0},instance.numMovesStones(4,3,2));
        assertArrayEquals(new int[] {1,2},instance.numMovesStones(3,5,1));
        assertArrayEquals(new int[] {2,6},instance.numMovesStones(1,9,5));
    }
}
