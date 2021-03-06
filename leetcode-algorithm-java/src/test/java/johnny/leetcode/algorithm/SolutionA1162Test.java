package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1162Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxDistance");
        SolutionA1162 instance = new SolutionA1162();

        assertEquals(2, instance.maxDistance(new int[][] {{1,0,1},{0,0,0},{1,0,1}}));
        assertEquals(-1, instance.maxDistance(new int[][] {{0,0,0},{0,0,0},{0,0,0}}));
        assertEquals(-1, instance.maxDistance(new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }
}
